package io.github.jalala984.simpleWebApp.service;

import io.github.jalala984.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 800), new Product(102, "Canon Camera", 300),new Product(103,"Shure Mic",900)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(prod -> prod.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }


}