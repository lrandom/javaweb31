package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoObjectWriter {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Desktop/human.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Human human = new Human();
            human.setName("Luan");
            human.setAge(31);
            Human human1 = new Human();
            human1.setAge(20);
            human1.setName("Hưng");

            Human[] humans = new Human[]{human, human1};

            objectOutputStream.writeObject(humans);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {

        }
    }
}
