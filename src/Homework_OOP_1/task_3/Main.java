package Homework_OOP_1.task_3;

import Homework_OOP_1.task_3.transport.Car;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "Желтый",
                2015,
                "Россия"
        );
        lada.setRegNumber("в777вв777");
        System.out.println(lada.isCorrectRegNumber());

        Car audi = new Car(
                "Audi",
                "A8",
                3.0,
                "Черный",
                2020,
                "Германия"
        );
        audi.setGears("автомат");
        Car bMW = new Car(
                "BMW",
                "Z8",
                3.0,
                "Черный",
                2021,
                "Германия"
        );
        bMW.setSummerTyres(false);
        Car kia = new Car(
                "Kia",
                "Sportage",
                2.4,
                "Красный",
                2018,
                "Южная Корея"
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея"
        );

        printInfo(lada);
        printInfo(audi);
        printInfo(bMW);
        printInfo(kia);
        printInfo(hyundai);
    }

    private static void printInfo(Car car) {
        System.out.println("Марка автомобиля - " + car.getBrand() +
                ", модель - " + car.getModel() +
                ", объем двигателя - " + car.getEngineVolume() +
                " л., цвет кузова - " + car.getColor() +
                ", год производства - " + car.getProductionYear() +
                ", страна сборки - " + car.getProductionCountry() +
                ", коробка передач - " + car.getGears() +
                ", тип кузова - " + car.getTypeOfBody() +
                ", рег. номер - " + car.getRegNumber() +
                ", кол-во мест - " + car.getSeatsCount() +
                ", " + (car.isSummerTyres()? "летняя" : "зимняя") + " резина"
        );
    }
}

