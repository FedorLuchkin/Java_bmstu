package lab5_var2_8;

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
        try {
            this.setId(id);
            this.setBrand(brand);
            this.setModel(model);
            this.setYearOfManufacture(yearOfManufacture);
            this.setColor(color);
            this.setPrice(price);
            this.setRegNum(regNum);
        } catch (InvalidInputException e) {
            // Handle exception related to mathematical operations or memory issues
            System.err.println("An error occurred while setting car properties: " + e.getMessage());
        }
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

    public void setId(int id) throws InvalidInputException {
        if (id <= 0) {
            throw new InvalidInputException("ID must be a positive integer.");
        }
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws InvalidInputException {
        if (brand == null || brand.isEmpty()) {
            throw new InvalidInputException("brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws InvalidInputException {
        if (model == null || model.isEmpty()) {
            throw new InvalidInputException("model cannot be null or empty.");
        }
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) throws InvalidInputException {
        if (yearOfManufacture <= 0) {
            throw new InvalidInputException("yearOfManufacture must be a positive integer.");
        }
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidInputException {
        if (color == null || color.isEmpty()) {
            throw new InvalidInputException("Color cannot be null or empty.");
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) throws InvalidInputException {
        if (price <= 0) {
            throw new InvalidInputException("price must be a positive integer.");
        }
        this.price = price;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) throws InvalidInputException {
        if (regNum == null || regNum.isEmpty()) {
            throw new InvalidInputException("regNum cannot be null or empty.");
        }
        this.regNum = regNum;
    }
}
