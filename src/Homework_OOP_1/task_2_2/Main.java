package Homework_OOP_1.task_2_2;

public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голандия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower peony = new Flower(null, "Англия", 69.9);
        chrysanthemum.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Турция", 19.5);
        chrysanthemum.lifeSpan = 10;

        printInfo(rosa);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);

        System.out.println();

        printCostOfFlowers(rosa, rosa, rosa, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila);

    }

    private static void printInfo (Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                ", страна: " + flower.getCountry() +
                ", стоимость: " + flower.getCost() +
                ", срок стояния: " + flower.lifeSpan + " дня(ей)");
    }

    private static void printCostOfFlowers (Flower... flowers) {
        double totalCost = 0;
        double minimalLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimalLifeSpan) {
                minimalLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: " + "%.2f", totalCost);
        System.out.println();
        System.out.println("Срок стояния букета: " + minimalLifeSpan);
    }
}
