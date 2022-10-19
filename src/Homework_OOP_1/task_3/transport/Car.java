package Homework_OOP_1.task_3.transport;

import java.util.Objects;


public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String gears,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres) {

        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        this.engineVolume = engineVolume;
        this.color = Objects.requireNonNullElse(color, "Белый");
        this.productionYear = productionYear;
        this.gears = Objects.requireNonNullElse(gears, "МКПП");
        this.regNumber = Objects.requireNonNullElse(regNumber, "x000xx000");
        this.typeOfBody = Objects.requireNonNullElse(typeOfBody, "седан");
        this.seatsCount = seatsCount;
        this.summerTyres = summerTyres;
    }

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry) {

        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "МКПП",
                "седан",
                "x000xx000",
                5,
                true
        );
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null){
            this.gears = "МКПП";
        }else {
            this.gears = gears;
        }

    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null){
            this.regNumber = "x000xx000";
        }else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void changeTyres () {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber () {
        if (regNumber.length()!=9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
}

