package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoFileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/lrandom/Desktop/demo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = "";
            while ((data = bufferedReader.readLine()) != null) {
                System.out.printf("%s\n", data);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {

        }
    }
}
