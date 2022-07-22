package com.example.t2009m1relationship.search;

import com.example.t2009m1relationship.T2009m1RelationshipApplication;
import com.example.t2009m1relationship.entity.Order;
import com.example.t2009m1relationship.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = T2009m1RelationshipApplication.class)
class OrderSpecificationTest {
    @Autowired
    OrderRepository orderRepository;

    @Test
    public void demoTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        OrderSpecification filter01 =
                new OrderSpecification(new SearchCriteria("createdAt", "=", LocalDateTime.parse("2022-07-12 08:43:37",formatter)));
        OrderSpecification filter02 =
                new OrderSpecification(new SearchCriteria("status", "=", 2));
        List<Order> orders = orderRepository.findAll(filter01.and(filter02));
        System.out.println(orders.size());

    }
}