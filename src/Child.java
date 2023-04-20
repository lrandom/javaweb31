public class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child Display");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
