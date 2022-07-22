package com.example.t2009m1relationship.repository;

import com.example.t2009m1relationship.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
