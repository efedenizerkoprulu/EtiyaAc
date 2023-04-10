package Entities;

public class Motorcycle extends Vehicle {

    int wheelCount;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Motorcycle(int id, String name, String model, String year, String brand, String engine, String color, int price, int wheelCount) {
        super(id, name, model, year, brand, engine, color,price);
        this.wheelCount = wheelCount;


    }
}
