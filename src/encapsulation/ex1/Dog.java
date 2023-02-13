package encapsulation.ex1;

public class Dog {
    private final String name;
    private final String race;
    private int age;
    private double weight;
    private final boolean  male;



    public Dog(String name, String race, int age, double weight, boolean male) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
        this.male = male;

    }

    public Dog(boolean male, String race) {
        this("Dog", race, 0, 300, male);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + male +
                '}';
    }
}
