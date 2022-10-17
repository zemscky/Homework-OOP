package Homework_OOP_1.task_3;

import java.util.Objects;


public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        this.color = Objects.requireNonNullElse(color, "Белый");

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }


    }
    void characteristics() {
        System.out.println("Марка автомобиля - " + brand + ", модель - " + model +
                ", объем двигателя - " + engineVolume + " л., цвет кузова - " + color +
                ", год производства - " + productionYear + ", страна сборки - " + productionCountry);
    }
}
