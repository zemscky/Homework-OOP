package Homework_OOP_1.task_1_2;

import java.util.Objects;

public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
     private final String job;

     int currentYear = 2022;

    public Human(int yearOfBirth, String name, String town, String job) {

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
    }

    void talk () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + (currentYear - yearOfBirth) + " году. Я работаю на должности: " + job + ". Будем знакомы!");
    }

}
