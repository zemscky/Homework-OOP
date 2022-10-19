package Homework_OOP_1.task_1_2;

import java.time.LocalDate;
import java.util.Objects;


public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0 || town.isEmpty() || town.isBlank()) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
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
