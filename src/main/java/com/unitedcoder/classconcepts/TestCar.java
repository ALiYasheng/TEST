package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.setBrand("BMW");
        BMW.setMade("german");
        BMW.setColor("Black");
        BMW.setPrice(50000);
        BMW.setYear(2021);
        BMW.setModel("x6");

        Car benz = new Car();
        benz.setBrand("Benz");
        benz.setMade("German");
        benz.setColor("Red");
        benz.setPrice(80000);
        benz.setYear(2025);
        benz.setModel("S300");

        Car Audi = new Car();
        Audi.setBrand("Audi");
        Audi.setMade("German");
        Audi.setColor("Grey");
        Audi.setPrice(30000);
        Audi.setYear(2022);
        Audi.setModel("A8");

        List<Car> cars = new ArrayList<>();
        cars.add(benz);
        cars.add(Audi);
        cars.add(BMW);

        for (Car car:cars){
            //System.out.println(car);
            if (car.getBrand().equalsIgnoreCase("benz")){
                System.out.println(car);
            }
        }

        System.out.println(BMW.getColor());
        System.out.println(BMW.getBrand());
        System.out.println(BMW.getMade());
        System.out.println(BMW.getPrice());
        System.out.println(BMW.getYear());
        System.out.println(BMW.getModel());
        System.out.println(BMW);
        System.out.println(BMW.getColor());


        System.out.println("===================================================");

        System.out.println(benz);
        System.out.println("===================================================");
        System.out.println(Audi);
    }
}
