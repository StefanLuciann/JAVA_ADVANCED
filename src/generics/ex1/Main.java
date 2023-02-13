package generics.ex1;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a Person class that will implement a Comparable interface.
 * Person class should implement compareTo method, that will verify if one person is taller than another.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Andrei" , LocalDate.now(), 181);
        Person person2 = new Person("Igor" , LocalDate.now(), 150);
        Person person3 = new Person("John", LocalDate.now(), 190);


        System.out.println(person1.compareTo(person2));
        System.out.println(person1.compareTo(person3));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Collections.sort(personList);

        System.out.println(personList);


    }


}
