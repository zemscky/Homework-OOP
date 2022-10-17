package Homework_OOP_1.task_3;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",1.7,
                "Желтый",2015, "Россия");
        Car audi = new Car("Audi","A8",3.0,
                "Черный",2020, "Германия");
        Car bMW = new Car("BMW","Z8",3.0,
                "Черный",2021, "Германия");
        Car kia = new Car("Kia","Sportage",2.4,
                "Красный",2018, "Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6,
                "Оранжевый",2016, "Южная Корея");

        lada.characteristics();
        audi.characteristics();
        bMW.characteristics();
        kia.characteristics();
        hyundai.characteristics();
    }
}
