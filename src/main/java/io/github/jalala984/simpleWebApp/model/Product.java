package io.github.jalala984.simpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int prodId;
    private String prodName;
    private int prodCost;

    public Product() {

    }

    public Product(int prodId, String prodName, int prodCost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdCost() {
        return prodCost;
    }

    public void setProdCost(int prodCost) {
        this.prodCost = prodCost;
    }
}
