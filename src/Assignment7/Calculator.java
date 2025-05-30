package Assignment7;

public class Calculator {
    int result;
    static int operationCount = 0;


    public void add(int a, int b) {
        result = a + b;
        operationCount++;
        System.out.println("Result: " + result);
    }


    public static void displayOperationCount() {
        System.out.println("Total operations performed: " + operationCount);
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();

        calc1.add(5, 10);
        calc2.add(20, 30);

        System.out.println("Calc1 Result: " + calc1.result);
        System.out.println("Calc2 Result: " + calc2.result);

        Calculator.displayOperationCount();
    }
}
