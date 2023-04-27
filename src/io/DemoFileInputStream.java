package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class DemoFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/lrandom/Desktop/demo.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            int data = 0;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.printf("%s",(char) data);
            }
            bufferedInputStream.close();
            fis.close();
        } catch (Exception e) {

        }
    }
}
