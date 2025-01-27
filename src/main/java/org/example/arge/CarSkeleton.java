package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name,String description) {
        this.name = name;
        this.description = description;
    }
    public CarSkeleton(){
    }

    public void startEngine(){
    }

    protected void runEngine(){
    }

    public void drive(){
        runEngine();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
