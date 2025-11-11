package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Çalıştırıldı");
    }
    public void drive(){
        System.out.println("Sürüldü");
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Motor çalıştırıldı");
    }

}
