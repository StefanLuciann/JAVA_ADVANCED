package exceptions.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        parseInput();
    }

    private static void parseInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a value");
        String inputString = scanner.next();

        try {
            int n = Integer.parseInt(inputString);
            System.out.println("int " + n);
        } catch (NumberFormatException e) {
            try {
                double n = Double.parseDouble(inputString);
                System.out.println("double " + n);
            } catch (NumberFormatException exception) {
                System.out.println("Hey! That's not a value! Try once more.");
                parseInput();
            }
        }
    }
}