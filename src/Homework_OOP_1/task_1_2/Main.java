package Homework_OOP_1.task_1_2;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-35,"Максим", "Минск","Бренд-менеджера");
        Human anna = new Human(29, "Аня", "Москва", "Методиста");
        Human katia = new Human(28, "Катя", "Калининград", "Продакт-менеджера");
        Human artem = new Human(27, "Артем", "Москва", "Директора по развитию бизнеса");
        Human vladimir = new Human(21,"Владимир", "Казань", null);

        printInfo(maksim);
        printInfo(anna);
        printInfo(katia);
        printInfo(artem);
        printInfo(vladimir);
    }
    public static void printInfo (Human human) {
        System.out.println("Привет! Меня зовут "+ human.name + ". Я из города "+ human.getTown() +
                ". Мне "+ human.getYearOfBirth() + " лет. Я работаю на должности "+ human.job + ". Будем знакомы!");
    }
}