package Homework;

import java.util.Scanner;

public class Main {
    //Write an application that implements a simple calculator. The application should:
    //a. read first number (type float)
    //b. read one of following symbols: + - / *
    //c. read second number (type float)
    //d. return a result of given mathematical operation
    //If the user provides a symbol other than supported, the application should print "Invalid
    //symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
    //principles of mathematics), the application should print "Cannot calculate".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        String operator = scanner.next();
        float num2 = scanner.nextFloat();
        if (operator.equals("+"))
        {
            System.out.println(num1 + num2);
        }
        if (operator.equals("-")) {
            System.out.println(num1 - num2);
        }
        if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }
        if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }
        if (!operator.equals("+") && !operator.equals("/") && !operator.equals("-") && !operator.equals("*")) {
            System.out.println("Invalid symbol");
        }
    }
}