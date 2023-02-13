package Stream.Ex1;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ##### Streams Exercise 1
 * 1. Using streams, for a given lists:
 * - [„John", „Sarah", „Mark", „Tyla", „Ellisha", „Eamonn"]
 * - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 *
 * - Sort the list.
 * - Print only those names, that start with „E" letter.
 * - Print values greater than 30 and lower than 200.
 * - Print names uppercase.
 * - Remove first and last letter, sort and print names.
 * - *Sort backwards by implementing reverse Comparator and using lambda expression.*/
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        List<String> list =names.stream()
                .sorted()
                .filter((name)->name.startsWith("E"))
                .collect(Collectors.toList());
        System.out.println(list);

        names.stream()
                .filter((name->name.endsWith("a")|| name.endsWith("ah")))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach((name)-> System.out.println(name));

        numbers.stream()
                .filter (number-> number>30&&number<200)
                .sorted()
                .forEach(number-> System.out.println(number));


        names.stream()
                .map(name->name.toUpperCase())
                .forEach(name-> System.out.println(name));

        names.stream()
                .map(name->name.substring(1,name.length()-1))
                .sorted()
                .forEach(name-> System.out.println(name));

        numbers.stream()
                .map(number->Integer.toString(number))
                .filter(string->string.length()>2)
                .map(string->string.charAt(0))
                .forEach(character -> System.out.println(character));


        }



    }

