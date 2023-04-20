public class Outer {
    //Regular Inner Class
    class Inner {
        public void display() {
            System.out.println("Inner Display");
        }
    }

    //Static Inner Class
    static class InnerStatic{
        public void display() {
            System.out.println("Inner Static Display");
        }
    }

    public void display() {
        class InnerLocal {
            public void display() {
                System.out.println("Inner Local Display");
            }
        }
        InnerLocal innerLocal = new InnerLocal();
        innerLocal.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.display();
    }
}
