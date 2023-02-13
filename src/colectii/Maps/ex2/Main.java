package colectii.Maps.ex2;

import java.util.*;

/**
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert something");
        String inputString = scanner.nextLine();

        Map<Character, List<Integer>> occurrencesByChar = new HashMap<>();
        char[] chars = inputString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if(!occurrencesByChar.containsKey(currentChar)) {
                List<Integer> positions = new ArrayList<>();
                positions.add(i);
                occurrencesByChar.put(currentChar, positions);
            } else {
                List<Integer> positions = occurrencesByChar.get(currentChar);
                positions.add(i);
                occurrencesByChar.put(currentChar,positions);
            }
        }
        System.out.println(occurrencesByChar);

    }
}