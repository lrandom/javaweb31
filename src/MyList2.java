import java.util.ArrayList;

public class MyList2 {
    public <T> void print(T[] arr) {
        for (T x : arr) {
            System.out.println(x);
        }
    }

    public <T extends Integer> T print(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (T) (Integer) ((Integer) num1 + (Integer) num2);
        }
        return null;
    }


    public void print2(ArrayList<? super Short> arr) {
        for (Object x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyList2 myList2 = new MyList2();
        myList2.print(new String[]{"Hihi", "Haha"});
        myList2.print(new Integer[]{1, 2, 3});
        myList2.print(new Float[]{1.1f, 2.2f, 3.3f});

        myList2.print2(new ArrayList<Number>() {{
            add(1);
            add(2);
        }});
    }
}
