package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoCopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/abc.png");
            int data = 0;
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/abc.png");
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
            fileOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {

        }
    }
}
