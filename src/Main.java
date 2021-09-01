import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        ArrayList<User> userFromClient = new ArrayList<>();
        userFromClient.add(new User(2, "kokos"));
        userFromClient.add(new User(1, "ananas"));
        userFromClient.add(new User(3, "banan"));
        userFromClient.add(new User(5, "tomat"));
        userFromClient.add(new User(4, "potatos"));
        userFromClient.add(new User(6, "mango"));


        String url = "jdbc:mysql://localhost:3306/first";
        Connection connection = DriverManager.getConnection(url, "root", "rootroot");

//        Statement statement = connection.createStatement();
//        statement.executeUpdate("insert into user(name) values('sergiy')");
//        System.out.println(statement);


//        for (User user : userFromClient) {
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into user(name) values(?)");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.executeUpdate();
//        }

        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
        connection.close();
    }
}