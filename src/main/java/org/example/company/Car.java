package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    public String startEngine(){
        String message = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message;
    }
    public String accelerate() {
        String message = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message;
    }
    public String brake(){
        String message =  "the car is braking";
        System.out.println(getClass().getSimpleName() + " " + message);
        return message;
    }


}
