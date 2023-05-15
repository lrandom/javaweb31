import java.util.ArrayList;

public class MyList4 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        myList.add("BMW");
        myList.add("Mercedes");
        myList.add("Audi");
        myList.add("Lexus");
        myList.add("Toyota");
        myList.add("Honda");
        myList.add("Hyundai");

        myList.get(0);
        myList.remove(0);
        myList.set(0, "BMW");
        myList.size();
        myList.clear();
        myList.contains("BMW");
        myList.indexOf("BMW");
        myList.lastIndexOf("BMW");
        myList.isEmpty();
        myList.toArray();
        myList.addAll(myList);
        myList.addAll(0, myList);
        for (String x : myList) {
                System.out.println(x);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
