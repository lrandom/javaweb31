package io;

import java.io.FileOutputStream;

public class DemoFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Desktop/demo.txt");
            fileOutputStream.write("Xin chào các bạn".getBytes());
            fileOutputStream.close();

        } catch (Exception e) {

        }
    }
}
