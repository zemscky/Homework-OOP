package Homework_OOP_1.task_1_2;

import java.time.LocalDate;
import java.util.Objects;


public class Human {
    private static final String DEFAULT_STRING_VALUE = "Информация не указана";
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(
            int yearOfBirth,
            String name,
            String town,
            String job) {

        setName(name);
        setTown(town);
        setYearOfBirth(yearOfBirth);
        setJob(job);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name,DEFAULT_STRING_VALUE);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = ValidationUtils.validOrDefault(town,DEFAULT_STRING_VALUE);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = ValidationUtils.validOrDefault(job,DEFAULT_STRING_VALUE);
    }

    private  int getAgeInYears() { // Расчет возраста
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут "+ name +
                ". Я из города "+ town +
                ". Мне " + getAgeInYears() +
                " лет. Я работаю на должности "+ job +
                ". Будем знакомы!";
    }

}
