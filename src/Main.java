import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //checked exception
        /*try {
            FileInputStream fis = new FileInputStream("name.txt");
        } catch (Exception e) {
            //e.printStackTrace();//in ra thông tin lỗi và dòng xảy ra lỗi
            System.out.println("Ôi bạn ơi, không có file nè, thử lại đi, please");
        }

        //unchecked exception
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("continue");*/

        System.out.println("Vui lòng nhập vào một số");

        //boolean checked = false;
        int number = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu nhập vào không hợp lệ");
            } catch (Exception e2) {
                System.out.println("Lỗi gì đó");
            }
        }
        System.out.println("Số bạn vừa nhập vào là");
        System.out.println(number);
    }
}
