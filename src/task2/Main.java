package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double number1 = readNumber(bufferedReader);
        double number2 = readNumber(bufferedReader);

        while (!validate(number2)) {
            System.out.println("Number can not be zero");
            number2 = readNumber(bufferedReader);
        }

        try {
            System.out.println(divide(number1, number2));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is impossible!");
        }

    }

    private static double divide(double number1, double number2) throws ArithmeticException {
        double div;
        div = number1 / number2;
        if (div == Double.POSITIVE_INFINITY || div == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException();
        }
        return div;
    }

    private static double readNumber(BufferedReader bufferedReader) {
        try {
            String stringNumber = bufferedReader.readLine();
            double result = Double.parseDouble(stringNumber);
            System.out.println("You have entered : " + result);
            return result;
        } catch (IOException e) {
            System.out.println("Smth happened. Try again!");
            return readNumber(bufferedReader);
        } catch (NumberFormatException e) {
            System.out.println("You need to enter double value. Try again.");
            return readNumber(bufferedReader);
        }
    }

    private static boolean validate(double number) {
        return number != 0;
    }
}
