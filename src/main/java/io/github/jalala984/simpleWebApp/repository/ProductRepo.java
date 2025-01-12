package io.github.jalala984.simpleWebApp.repository;

import io.github.jalala984.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {



}
