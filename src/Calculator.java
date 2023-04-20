public class Calculator {
    public int calculator(int a, int b) {
        return a + b;
    }

    public float calculator(int a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculator(10, 20.f);
    }
}
