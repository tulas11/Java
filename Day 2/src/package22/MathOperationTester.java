package package22;

public class MathOperationTester {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();

        int resultInt = mathOperation.add(5, 3);
        System.out.println("Sum of integers: " + resultInt);
       
        double resultDouble = mathOperation.add(5.5, 3.2);
        System.out.println("Sum of doubles: " + resultDouble);

        // Method accepting variable arguments of type int
        int resultVarargs = mathOperation.add(1, 2, 3, 4, 5);
        System.out.println("Sum of variable arguments: " + resultVarargs);
    }
}
