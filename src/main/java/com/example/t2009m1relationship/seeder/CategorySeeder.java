package com.example.t2009m1relationship.seeder;

import com.example.t2009m1relationship.entity.Category;
import com.example.t2009m1relationship.repository.CategoryRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CategorySeeder {
    @Autowired
    CategoryRepository categoryRepository;
    private static final int NUMBER_OF_CATEGORY = 10;
    public static ArrayList<Category> categories;

    public void generate() {
        Faker faker = new Faker();
        categories = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CATEGORY; i++) {
            Category obj = Category.builder()
                    .name(faker.name().name())
                    .build();
            categories.add(obj);
        }
        categoryRepository.saveAll(categories);
    }

}
