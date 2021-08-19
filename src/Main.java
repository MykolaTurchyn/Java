import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> olegFriends = new ArrayList<>();
        olegFriends.add("Sasha");
        olegFriends.add("Anna");

        ArrayList<String> olgaFriends = new ArrayList<>();
        olgaFriends.add("Olena");
        olgaFriends.add("Sergiy");

        Human Oleg = new Human(1, "Oleg", "Kachkov", 23, Gender.MALE, olegFriends);
        Human Olga = new Human(2, "Olga", "Paperovych", 18, Gender.FEMALE, olgaFriends);
        System.out.println(Oleg);
        System.out.println(Olga);


        // // // SuperCar
        Engine engineCar1 = new Engine("BMW", 1.2, 333);
        SuperCar car1 = new SuperCar("BMW", "BMW", 2001, engineCar1);
//        car1.getEngine().setVolume(2.5);
        car1.getEngine().setVolume(car1.getEngine().getVolume() * 0.1);
        System.out.println(car1);

        Engine engineCar2 = new Engine("VW", 2.0, 1212);
        SuperCar car2 = new SuperCar("WV", "WV", 2016, engineCar2);
        car2.getEngine().setVolume(3.0);

        car2.getEngine().setVolume(car2.getEngine().getVolume() - 0.4);
        System.out.println(car2);
    }
}

