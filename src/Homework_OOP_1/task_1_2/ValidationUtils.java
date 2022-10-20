package Homework_OOP_1.task_1_2;

public class ValidationUtils {
    public static String validOrDefault (String value, String defaultValue) {
       return value == null || value.isBlank() ? defaultValue : value;
    }
}
