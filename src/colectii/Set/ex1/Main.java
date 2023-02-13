package colectii.Set.ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Create a set consisting of colors - given from the user.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> colors = new HashSet<>();

        String newColor = "";

        while (!newColor.equals("Exit")&&!newColor.equals("exit")){
            System.out.println("Please insert a new color");
            newColor = scanner.nextLine();
            newColor = newColor.trim();
            if(!newColor.isBlank() && !newColor.equals("Exit")&& !newColor.equals("exit")){
                colors.add(newColor);
                System.out.println(colors);
            }
        }
    }
}
