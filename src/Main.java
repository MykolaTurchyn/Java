import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        User Vasya = new User(1, "Vasya", "Popovych", "vasyapopovych@gamil.com", 30, Gender.MAIL);
        User Olga = new User(3, "Olga", "Paperovych", "olgapaper@asd.com", 18, Gender.FEMALE);
        User Sanya = new User(2, "Sanya", "Kokosovych", "sanyakokos@ukr.net.ua", 19, Gender.MAIL);
        User Ira = new User(4, "Ira", "Sandorych", "irkasandorych@mai.ru", 10, Gender.FEMALE);
        System.out.println(Vasya);
        System.out.println(Olga);
        System.out.println(Sanya);
        System.out.println(Ira);
    }
}