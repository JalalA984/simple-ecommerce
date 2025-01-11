package io.github.jalala984.simpleWebApp.model;

import lombok.Data;

@Data
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    // Use lombok to create getter/setter
}
