package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class DownloadFile {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
            BufferedInputStream fileInputStream = new BufferedInputStream(url.openStream());
            int data = 0;
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/abc.png");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            while ((data = fileInputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }
            fileOutputStream.close();
            fileInputStream.close();
            bufferedOutputStream.close();

        } catch (Exception e) {

        }
    }
}
