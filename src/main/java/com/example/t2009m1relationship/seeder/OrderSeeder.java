//package com.example.t2009m1relationship.seeder;
//
//import com.example.t2009m1relationship.entity.Order;
//import com.example.t2009m1relationship.entity.OrderSeedByTime;
//import com.example.t2009m1relationship.entity.enums.OrderSeedByTimeType;
//import com.example.t2009m1relationship.entity.enums.OrderSimpleStatus;
//import com.example.t2009m1relationship.repository.OrderRepository;
//import com.github.javafaker.Faker;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@Slf4j
//public class OrderSeeder {
//    public static List<Order> orders;
//    public static final int NUMBER_OF_ORDER = 1000;
//    public static final int NUMBER_OF_DONE = 600;
//    public static final int NUMBER_OF_CANCEL = 200;
//    public static final int NUMBER_OF_PENDING = 200;
//    public static final int MIN_ORDER_DETAIL = 2;
//    public static final int MAX_ORDER_DETAIL = 5;
//    public static final int MIN_PRODUCT_DETAIL = 1;
//    public static final int MAX_PRODUCT_DETAIL = 5;
//
//    @Autowired
//    OrderRepository orderRepository;
//    List<OrderSeedByTime> seeder;
//    public void configData() {
//        seeder = new ArrayList<>();
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.DAY).day(18).month(Month.JUNE).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.DAY).day(17).month(Month.JUNE).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.MONTH).month(Month.JUNE).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.PROCESSING).seedByTimeType(OrderSeedByTimeType.MONTH).month(Month.JUNE).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.MONTH).month(Month.MAY).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.MONTH).month(Month.APRIL).year(2022)
//                        .build());
//        seeder.add(
//                OrderSeedByTime.builder()
//                        .orderStatus(OrderSimpleStatus.DONE).seedByTimeType(OrderSeedByTimeType.MONTH).month(Month.MARCH).year(2022)
//                        .build());
//    }
//    public void generate() {
//        configData();
//        Faker faker = new Faker();
//        orders = new ArrayList<>();
//        for (OrderSeedByTime orderSeedByTime:
//             seeder) {
//            int numberOfOrder = orderSeedByTime.getOrderCount();
//            for (int i = 0; i < numberOfOrder; i++) {
//                int randomUserIndex = NumberUtil.getRandomNumber(0, Userseeder.users.size() -1);
//                User user =
//
//            }
//
//        }
//    }
//}
