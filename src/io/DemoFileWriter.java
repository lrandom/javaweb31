package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DemoFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/lrandom/Desktop/demo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //fileWriter.write("Xin chào các bạn hihi");
            bufferedWriter.write("Xin chào các bạn hihihihihihi");
            bufferedWriter.flush();
            fileWriter.close();
        } catch (Exception e) {

        }
    }
}
