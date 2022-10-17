public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(35,"Максим", "Минск");
        Human anna = new Human(29, "Аня", "Москва");
        Human katia = new Human(28, "Катя", "Калининград");
        Human artem = new Human(27, "Артем", "Москва");

        maksim.talk();
        anna.talk();
        katia.talk();
        artem.talk();
    }
}