package Homework_OOP_1.task_3;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;



    }
    void characteristics() {
        System.out.println("Марка автомобиля - " + brand + ", модель - " + model +
                ", объем двигателя - " + engineVolume + " л., цвет кузова - " + color +
                ", год производства - " + productionYear + ", страна сборки - " + productionCountry);
    }
}
