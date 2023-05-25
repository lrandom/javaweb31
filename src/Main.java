public class Main {
    public static void main(String[] args) {
       /* MyThread myThread = new MyThread();


        MyThread myThread1 = new MyThread();


        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);

        thread.setPriority(10);
        myThread.setPriority(1);
        myThread1.setPriority(1);

        myThread.start();
        //myThread1.start();
        thread.start();*/

       /* Count count = new Count();
        MyThread3 myThread3 = new MyThread3(count);
        MyThread3 myThread4 = new MyThread3(count);

        myThread3.start();
        myThread4.start();*/
        Person person = new Person();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                person.wakeup();
                person.washTeeth();
                person.goToWork();
                person.continueToWork();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                person.eatBreakFast();
            }
        });
        thread1.start();
        thread2.start();
    }
}
