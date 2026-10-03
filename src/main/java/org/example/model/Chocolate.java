package org.example.model;

public class Chocolate extends ProductForSale {
    private double cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        this(type, price, description, 60.0);
    }

    public Chocolate(String type, double price, String description, double cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate -> type: " + getType()
                + ", price: " + getPrice()
                + ", description: " + getDescription()
                + ", cocoaPercentage: " + cocoaPercentage);
    }
}
