package Homework_OOP_1.task_2_2;

public class Flower {
    private String title; // цвет цветка
    private String country; // страна происхождения
    private float cost; // стоимость
    private int lifeSpan; // срок стояния, указанный в целых днях

    public Flower(
            String title,
            String country,
            float cost,
            int lifeSpan) {

        setTitle(title);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = ValidationUtils.validOrDefault(title, "rose");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Russia");
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }

    @Override
    public String toString() {
        return "Цветок: " +
                "название - " + title +
                ", страна - " + country +
                ", стоимость - " + cost +
                ", срок стояния - " + lifeSpan;
    }
}
