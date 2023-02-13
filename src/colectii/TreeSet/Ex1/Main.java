package colectii.TreeSet.Ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> colours =new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        String newColour = "";
        while(!newColour.equals("Exit")){
            System.out.println("Please insert a new colour");
            newColour = scanner.nextLine();
            newColour = newColour.trim();

            if(!newColour.isBlank()&& !newColour.equals("Exit")){
                colours.add(newColour);
                System.out.println(colours);
            }
        }
    }
}
