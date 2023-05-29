import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_31", "root", "koodinh@");
            System.out.println("Connect successfully");
            System.out.println("Nhập vào một cái danh mục");
            Scanner scanner = new Scanner(System.in);
            String categoryName = scanner.nextLine();

            PreparedStatement prp = connection.prepareStatement("INSERT INTO category(name) VALUES(?)");

            prp.setString(1, categoryName);
            prp.executeUpdate();

            categoryName = "TEST";
            prp.setString(1, categoryName);
            prp.executeUpdate();
        } catch (Exception e) {

        }
    }
}
