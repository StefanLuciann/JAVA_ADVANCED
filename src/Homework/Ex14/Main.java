package Homework.Ex14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using functional programming mechanisms based on the given structure, display:
 * 1. a list of all Models,
 * 2. a list of all cars,
 * 3. list of all manufacturer names,
 * 4. list of all manufacturers' establishment years,
 * 5. list of all model names,
 * 6. list of all years of starting production of models,
 * 7. list of all car names,
 * 8. list of all car descriptions,
 * 9. only models with an even year of production start,
 * 10. only cars from manufacturers with an even year of foundation,
 * 11. only cars with an even year of starting production of the model and an odd year of establishing the manufacturer,
 * 12. only CABRIO cars with an odd year of starting model production and an even year of establishing the manufacturer,
 * 13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than 1919
 */
public class Main {
    public static void main(String[] args) {

        Car bmwCabrio = new Car("BMW", "Gasoline", CarType.CABRIO);
        Car bmwHatchback = new Car("BMW", "Gasoline", CarType.HATCHBACK);
        Car bmwSedan = new Car("BMW", "Diesel", CarType.SEDAN);
        Car bmwCoupe = new Car("BMW", "Hybrid", CarType.COUPE);

        Car MBCabrio = new Car("Mercedes-Benz", "Gasoline", CarType.CABRIO);
        Car MBHatchback = new Car("Mercedes-Benz", "Diesel", CarType.HATCHBACK);
        Car MBSedan = new Car("Mercedes-Benz", "Diesel", CarType.SEDAN);
        Car MBCoupe = new Car("Mercedes-Benz", "Gasoline", CarType.COUPE);

        List<Car> bmwCars = new ArrayList<>();
        bmwCars.add(bmwCabrio);
        bmwCars.add(bmwHatchback);
        bmwCars.add(bmwSedan);
        bmwCars.add(bmwCoupe);

        List<Car> MBCars = new ArrayList<>();
        MBCars.add(MBCabrio);
        MBCars.add(MBHatchback);
        MBCars.add(MBSedan);
        MBCars.add(MBCoupe);

        Model bmw1Series = new Model("1 Series", 1948, bmwCars);
        Model bmw3Series = new Model("3 Series", 1952, bmwCars);
        Model bmw5Series = new Model("5 Series", 1965, bmwCars);
        Model bmw7Series = new Model("7 Series", 1977, bmwCars);

        Model MBAClass = new Model("A-Class", 1951, MBCars);
        Model MBBClass = new Model("B-Class", 1959, MBCars);
        Model MBCClass = new Model("C-Class", 1961, MBCars);
        Model MBEClass = new Model("E-Class", 1966, MBCars);


        List<Model> bmwModels = new ArrayList<>();
        bmwModels.add(bmw1Series);
        bmwModels.add(bmw3Series);
        bmwModels.add(bmw5Series);
        bmwModels.add(bmw7Series);

        List<Model> MBModels = new ArrayList<>();
        MBModels.add(MBAClass);
        MBModels.add(MBBClass);
        MBModels.add(MBCClass);
        MBModels.add(MBEClass);





        Manufacturer bmwManufacturer = new Manufacturer(
                "Bavarian Motor Works",
                1915,
                bmwModels);
        Manufacturer MBManufacturer = new Manufacturer(
                "Mercedes-Benz",
                1926,
                MBModels);

        List<Manufacturer> manufacturers = new ArrayList<>(); // add items to the list
        manufacturers.add(bmwManufacturer);
        manufacturers.add(MBManufacturer);
        //1.
        System.out.println("---------------------------------------------------Models---------------------------------------------------------------------");

        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .forEach(model -> System.out.println(model));
        //2.
        System.out.println("-------------------------------------------------------Cars-----------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .map(model -> model.getCars())
                .flatMap(cars -> cars.stream())
                .forEach(car -> System.out.println(car));

        //3
        System.out.println("-------------------------------------------------------Manufacturer Name-----------------------------------------------------------------------");

        manufacturers.stream()
                .forEach(manufacturer -> System.out.println(manufacturer.getName(manufacturers)));

        //4
        System.out.println("--------------------------------------------------------Manufact establysh Year---------------------------------------------------------------------");

        manufacturers.stream()
                .forEach(manufacturer -> System.out.println(manufacturer.getYearOfCreation()));

        //5
        System.out.println("--------------------------------------------------------------List of models--------------------------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .map(model -> model.getName())
                .forEach(modelsName -> System.out.println(modelsName));
        //6
        System.out.println("----------------------------------------------- years of starting production of models------------------------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .map(model -> model.getProductionStartYear())
                .forEach(year -> System.out.println(year));

        //7
        System.out.println("-----------------------------------------------List of all car names------------------------------------------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .map(model -> model.getCars())
                .flatMap(cars -> cars.stream())
                .map(car -> car.getName())
                .forEach(car -> System.out.println(car));

        //8
        System.out.println("-------------------------------------------------------list of all car descriptions-----------------------------------------------------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .map(model -> model.getCars())
                .flatMap(cars -> cars.stream())
                .map(car -> car.getDescription())
                .forEach(description -> System.out.println(description));

        //9
        System.out.println("---------------- Models with an even year of production start -----------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .forEach(year -> System.out.println(year));

        //10
        System.out.println("----------------------------cars from manufacturers with an even year of foundation--------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getYearOfCreation()%2==0)
                .forEach(manufacturer-> System.out.println(manufacturers));
        //11
        System.out.println("----------------------------------------only cars with an even year of starting production of the model and an odd year of establishing the manufacturer------------------------------------------------------------------------------------");
        manufacturers.stream()
                .map(manufacturer -> manufacturer.getModels())
                .flatMap(models -> models.stream())
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .forEach(year -> System.out.println(year));

        manufacturers.stream()
                .map(manufacturer -> manufacturer.getYearOfCreation()%2==1)
                .forEach(manufacturer-> System.out.println(manufacturer));

    }
}
