package org.example.model;

public class Coke extends ProductForSale {
    private int volumeMl;

    public Coke(String type, double price, String description) {
        this(type, price, description, 330);
    }

    public Coke(String type, double price, String description, int volumeMl) {
        super(type, price, description);
        this.volumeMl = volumeMl;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke -> type: " + getType()
                + ", price: " + getPrice()
                + ", description: " + getDescription()
                + ", volumeMl: " + volumeMl);
    }
}
