package Homework_OOP_1.task_2_2;

public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голандия", 35.59f, 0);
        Flower chrysanthemum = new Flower(null, null, 15f, 5);
        Flower peony = new Flower(null, "Англия", 69.9f, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5f, 10);

        System.out.println(rosa);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        Bouquet bouquet = new Bouquet(new Flower[] {rosa, rosa, rosa, gypsophila, gypsophila});
        System.out.println("Bouquet cost: " + bouquet.getCost());
        System.out.println("Bouquet lifeSpan: " + bouquet.getLifeSpan());
    }
}
