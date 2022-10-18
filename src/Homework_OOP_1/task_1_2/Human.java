package Homework_OOP_1.task_1_2;

import java.util.Objects;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String job;

     int currentYear = 2022;

    public Human(int yearOfBirth, String name, String town, String job) {

        this.yearOfBirth = yearOfBirth;
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = town;
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
    }

    void talk () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + (currentYear - yearOfBirth) + " году. Я работаю на должности: " + job + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth >= 0 && yearOfBirth != null) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
    }
}
