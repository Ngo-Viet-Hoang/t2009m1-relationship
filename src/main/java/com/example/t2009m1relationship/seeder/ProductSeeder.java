package com.example.t2009m1relationship.seeder;

import com.example.t2009m1relationship.entity.Product;
import com.example.t2009m1relationship.repository.ProductRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class ProductSeeder {
    @Autowired
    ProductRepository productRepository;

    private static final int NUMBER_OF_PRODUCT = 100;

    public void generate(){
        Random random = new Random();
        Faker faker = new Faker();
        int maxIndexCategory = CategorySeeder.categories.size() - 1;
        int minIndexCategory = 0;
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PRODUCT; i++) {
            Product product = Product.builder()
                    .name(faker.name().name())
                    .category(CategorySeeder.categories
                            .get(random.nextInt(maxIndexCategory - minIndexCategory)
                            +minIndexCategory))
                    .build();
            products.add(product);
        }
        productRepository.saveAll(products);
    }

}
