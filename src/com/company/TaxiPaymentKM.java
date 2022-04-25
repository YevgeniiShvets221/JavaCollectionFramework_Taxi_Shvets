package com.company;

public class TaxiPaymentKM implements  IPrice {
    private int distance;
    private String name;
    private int cost;

    public TaxiPaymentKM() {
    }

    public TaxiPaymentKM(int distance, String name, int cost) {
        this.distance = distance;
        this.name = name;
        this.cost = cost;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TaxiPaymentKM{" +
                "distance=" + distance +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int getTotalPrice() {
        return this.getCost();
    }
}
