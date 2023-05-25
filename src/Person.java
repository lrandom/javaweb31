public class Person {
    synchronized public void wakeup() {
        System.out.println("Person wakes up");
    }

    synchronized public void eatBreakFast() {
        System.out.println("Person eatBreakFast");
        try {
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void goToWork() {
        System.out.println("Person go to work");
        try {
            wait();
        } catch (Exception e) {

        }
    }

    synchronized public void washTeeth() {
        System.out.println("Person wash teeth");
    }

    synchronized public void continueToWork() {
        System.out.println("Person continue to work");

    }

}
