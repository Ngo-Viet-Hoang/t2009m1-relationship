package com.example.t2009m1relationship.repository;

import com.example.t2009m1relationship.T2009m1RelationshipApplication;
import com.example.t2009m1relationship.entity.Order;
import com.example.t2009m1relationship.entity.OrderDetail;
import com.example.t2009m1relationship.entity.OrderDetailId;
import com.example.t2009m1relationship.entity.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = T2009m1RelationshipApplication.class)
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;

    @Test
    public void testLinhTinh() {
        Product product1 = Product.builder()
                .name("Product1")
                .build();
        Product product2 = Product.builder()
                .name("Product2")
                .build();
        productRepository.save(product1);
        productRepository.save(product2);

        List<Product> products = productRepository.findAll();
        Order order = Order.builder()
                .id(System.currentTimeMillis())
                .createdAt(LocalDateTime.now())
                .status(1)
                .build();
        HashSet<OrderDetail> orderDetails = new HashSet<>();
        for(Product product :
        products){
            OrderDetail orderDetail = OrderDetail.builder()
                    .orderDetailId(OrderDetailId.builder()
                            .orderId(order.getId())
                            .productId(product.getId())
                            .build())
                    .order(order)
                    .product(product)
                    .quantity(10)
                    .unitPrice(0)
                    .build();
            orderDetails.add(orderDetail);
        }
        order.setOrderDetails(orderDetails);
        orderRepository.save(order);
        System.out.println("Hello");
    }

}