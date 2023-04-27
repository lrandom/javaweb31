package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoObjectReader {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/human.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Human[] humans = (Human[]) objectInputStream.readObject();
            for (int i = 0; i < humans.length; i++) {
                System.out.println(humans[i].getName());
                System.out.println(humans[i].getAge());
            }
        } catch (Exception e) {

        }
    }
}
