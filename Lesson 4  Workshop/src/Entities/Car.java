package Entities;

public class Car extends Vehicle {

    int wheelCount;
    public Car(int id, String name, String model, String year, String brand, String engine, String color, int price,  int wheelCount) {
        super(id, name, model, year, brand, engine, color,price);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}

