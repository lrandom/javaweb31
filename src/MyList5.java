import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MyList5 {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("BMW", "X5");
        myMap.put("Mercedes", "S500");
        myMap.put("Audi", "A8");
        myMap.put("Lexus", "RX350");
        myMap.put("Toyota", "Camry");
        myMap.put("Honda", "Civic");
        myMap.put("Hyundai", "Accent");

        System.out.println(myMap.get("BMW"));
        System.out.println(myMap.get("Mercedes"));
        myMap.remove("BMW");
        myMap.put("BMW", null);

        for (String k : myMap.keySet()) {
            System.out.println(k + ":" + myMap.get(k));
        }

        for (String v : myMap.values()) {
            System.out.println(v);
        }

        Iterator<String> iterator = myMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " " + myMap.get(key));
        }
    }
}
