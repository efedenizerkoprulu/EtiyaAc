package Entities;

public class Vehicle {
    private int id;
    private String name;
    private String model;
    private String year;
    private String brand;
    private String engine;
    private String color;
    private int price;


    public Vehicle(int id, String name, String model, String year, String brand, String engine, String color, int price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
