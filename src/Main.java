import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User userOne = new User(1, "Andriy");
        Boss bossOne = new Boss("Anatoliy", 24);
        Printable[] printUser = {userOne, bossOne};
        Printable printUse1 = printUser[0];
        doPrint(userOne);
    }

    public static void doPrint(Printable print) {
        print.print();
    }
}


