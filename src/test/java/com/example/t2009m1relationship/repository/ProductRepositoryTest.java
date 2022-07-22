package com.example.t2009m1relationship.repository;

import com.example.t2009m1relationship.T2009m1RelationshipApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = T2009m1RelationshipApplication.class)
class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void testLinhTinh() {
        System.out.println("Hello");
    }


}