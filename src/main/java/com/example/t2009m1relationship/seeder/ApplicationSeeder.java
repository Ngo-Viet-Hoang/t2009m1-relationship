package com.example.t2009m1relationship.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationSeeder implements CommandLineRunner {
    private final boolean needSeeder = true;
    @Autowired
    CategorySeeder categorySeeder;
    @Autowired
    ProductSeeder productSeeder;

    public void run(String... args) throws Exception{
        if(needSeeder) {
            categorySeeder.generate();
            productSeeder.generate();
        }
    }
}
