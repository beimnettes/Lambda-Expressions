@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationExample {
    public static void main(String[] args) {
        // Addition
        MathOperation addition = (a, b) -> a + b;

        // Subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Division
        MathOperation division = (a, b) -> a / b;

        // Using the operations
        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        System.out.println("Division: " + division.operate(6, 3));
    }
}
