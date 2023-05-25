public class MyThread3 extends Thread {
    Count count;

    MyThread3(Count count) {
        this.count = count;
    }

    public void run() {
        count.printNumber();
    }
}
