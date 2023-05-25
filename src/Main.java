import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Load Driver For Mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_31", "root", "koodinh@");
            System.out.println("Connect successfully");

            /*System.out.println("VUI LÒNG NHẬP TÊN DANH MỤC");
            Scanner scanner = new Scanner(System.in);
            String categoryName = scanner.nextLine();
            Statement stm = connection.createStatement();
            stm.executeUpdate("INSERT INTO  category(name) VALUES('" + categoryName + "')");*/

            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Vui lòng chọn ID danh mục muốn cập nhật");
            int id = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Vui lòng cho biết tên muốn đổi");
            String name = scanner.nextLine();

            Statement stm = connection.createStatement();
            String sql = "UPDATE category SET name='" + name + "' WHERE id=" + id;
            stm.executeUpdate(sql);*/

            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Vui lòng chọn ID danh mục muốn xóa");
            int id = scanner.nextInt();
            Statement stm = connection.createStatement();
            String sql = "DELETE FROM category WHERE id=" + id;
            stm.executeUpdate(sql);*/

            Statement stm = connection.createStatement();
            String sql = "SELECT * FROM category";
            ResultSet resultSet = stm.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
