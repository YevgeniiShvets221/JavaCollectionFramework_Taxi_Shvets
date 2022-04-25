package com.company;

public class TaxiPaymentHRS implements IPrice{
    private String name;
    private int cost;
    private int time;

    public TaxiPaymentHRS() {
    }

    public TaxiPaymentHRS(String name, int cost, int time) {
        this.name = name;
        this.cost = cost;
        this.time = time;
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

    public int getDistance() {

        return time;
    }

    public void setDistance(int distance) {

        this.time = distance;
    }

    @Override
    public String toString() {
        return "TaxiPaymentHRS{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", time=" + time +
                '}';
    }

    @Override
    public int getTotalPrice() {
        return this.getCost();
    }
}
