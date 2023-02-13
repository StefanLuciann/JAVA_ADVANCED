
package encapsulation.ex1;
/**
 * Create class Dog.
 * a) Add private fields to the class, like name, age, gender, race, weight.
 * b) Create constructor that accepts all of the class fields.
 * c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
 * d) Create getters and setters for age and weight.
 * e) Create object of class Dog. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 */


public class Main {



    public static void main(String[] args) {



        Dog[] dogs = new Dog[3];


        dogs[0] = new Dog("Skippy", "boxer", 5, 30.0, true);
        dogs[1] = new Dog("Ace", "bulldog", 2, 20.0, true);
        dogs[2] = new Dog("Toby", "golden", 1, 25.0, true);

        for (int i = 0; i <= dogs.length - 1; i++) {
            System.out.println(dogs[i]);
        }
    }
}