package lab3_var4_7;

import java.util.Random;


public class Service {
    private String name;
    private double cost;

    public Service(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public Service(String name){
        Random random = new Random();
        this.name = name;
        this.cost = random.nextInt(10) + 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("service: {name: '%s'; cost: %.3f}", getName(), getCost());
    }
}
