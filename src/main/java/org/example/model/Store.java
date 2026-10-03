package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Snack", 25.5, "Dark chocolate", 70.0),
                new Coke("Drink", 30, "Coca Cola", 500),
                new Bread("Bakery", 10, "Sourdough bread", "Whole wheat")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}
