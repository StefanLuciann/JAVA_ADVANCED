package exceptions.ex2;

public class Car {
    private String id;
    private String name;
    private int yearOfProduction;

    public Car(String id, String name, int yearOfProduction) {
        setId(id);
        setName(name);
        setYearOfProduction(yearOfProduction);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.isBlank()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID was null/blank");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name was null/blank");
        }
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction >= 1000) {
            this.yearOfProduction = yearOfProduction;
        } else {
            throw new IllegalArgumentException("Year of production was invalid");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
