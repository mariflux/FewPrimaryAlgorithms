package lambdas;

import java.util.Scanner;

public class Calculator {
//    @Override
//    public double add(double addend1, double addend2) {
//        return addend1 + addend2;
//    }
//
//    @Override
//    public double divide(double dividend, double divisor) {
//        return dividend / divisor;
//    }
//
//    @Override
//    public double multiply(double factor1, double factor2) {
//        return factor1 * factor2;
//    }
//
//    @Override
//    public double subtract(double minuend, double subtrahend) {
//        return minuend - subtrahend;
//    }

    public static void main(String[] args) {

        Addition addition = (a, b) -> a + b;
        Subtraction subtraction = (a, b) -> a - b;
        Multiplication multiplication = (a, b) -> a * b;
        Division division = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException ae) {
                System.out.println("You can't divide by zero. Don't you know?");

            }
            return a/b;
        };
        System.out.println("What arithmetic operation would you like to perform?\n" +
                "- addition (type \"A\")\n" +
                "- subtraction (type \"S\")\n" +
                "- multiplication (type \"M\")\n" +
                "- division (type \"D\")\n");
        Scanner scanner = new Scanner(System.in);
        String operationMark = scanner.nextLine();
        System.out.println("Enter two numbers to perform operation");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (operationMark.equalsIgnoreCase("A")) {
            System.out.println("Sum: " + addition.add(num1, num2));

        } else if (operationMark.equalsIgnoreCase("S")) {
            System.out.println("Difference: " + subtraction.subtract(num1, num2));


        } else if (operationMark.equalsIgnoreCase("M")) {
            System.out.println("Product: " + multiplication.multiply(num1, num2));

        } else if (operationMark.equalsIgnoreCase("D")) {
            System.out.println("Quotient: " + division.divide(num1, num2));


        } else {
            System.out.println("There is no operation under this mark");

        }

    }
}
