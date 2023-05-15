import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        myList.add("Hihi");
        //ép kiểu tường minh
        String num = myList.get(0);
        System.out.println(num);
    }
}
