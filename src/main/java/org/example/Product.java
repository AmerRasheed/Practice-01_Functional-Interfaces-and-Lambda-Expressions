package org.example;

public class Product {
    public static int counter=0;
    private int prodId;
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.prodId = ++counter;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
