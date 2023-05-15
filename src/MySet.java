import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("BMW");
        mySet.add("Mercedes");
        mySet.add("BMW");

        for (String x : mySet) {
            System.out.println(x);
        }
    }
}
