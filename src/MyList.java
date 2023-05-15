public class MyList<T,K> {
    public void print(T[] arr, K[] arr1) {
        for (T x : arr) {
            System.out.println(x);
        }
        for (K x : arr1) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyList<String,Integer> myList = new MyList<>();
        String[] arr = {"Hihi", "Haha"};
        Integer[] arr2 = new Integer[]{1, 2, 3};
        myList.print(arr,arr2);

        MyList<Integer,Float> myList1 = new MyList<>();
        Integer[] arr1 = {1, 2, 3};
        Float[] arr3 = new Float[]{1.1f, 2.2f, 3.3f};
        myList1.print(arr1,arr3);
    }
}
