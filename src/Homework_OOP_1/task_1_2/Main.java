package Homework_OOP_1.task_1_2;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-35,"Максим", "Минск","Бренд-менеджера");
        Human anna = new Human(29, "Аня", "Москва", "Методиста");
        Human katia = new Human(28, "Катя", "Калининград", "Продакт-менеджера");
        Human artem = new Human(27, "Артем", "Москва", "Директора по развитию бизнеса");
        Human vladimir = new Human(21,"Владимир", "Казань", null);

        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katia);
        System.out.println(artem);
        System.out.println(vladimir);
    }
}