package com.unitedcoder.classconcepts;

public class Car {
    //class level variable
    private String color;
    private String brand;
    private long price;
    private String model;
    private String made;
    private int year;


    //Default constructor
    public Car() {
        System.out.println("Car is coming!!!");
    }

    public Car(String color, String brand, long price, String model, String made, int year) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.made = made;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        /*return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", year=" + year +
                '}';*/
        return brand+", " +color+"," + price+","+model+","+ year+" " ;
    }
}
