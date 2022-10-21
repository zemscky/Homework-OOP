package Homework_OOP_1.task_2_2;

public class Bouquet {

    private final Flower[] flowers;

    public Bouquet (Flower[] flowers) {
        this.flowers = flowers;
    }

    public float getCost() {
        float sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
}
