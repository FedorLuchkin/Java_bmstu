package lab3_var2_8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Car {
    private int id;
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;
    private double price;
    private String regNum;

    public Car(int id, String brand, String model, int yearOfManufacture,
               String color, double price, String regNum) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        return String.format("""
                Phone = {
                \tid: %d;
                \tbrand: %s;
                \tmodel: %s;
                \tyearOfManufacture: %s;
                \tcolor: %s;
                \tprice: %.3f;
                \tregNum: %s;
                }""",
                id, brand, model, yearOfManufacture, color, price, regNum);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String model) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
}
