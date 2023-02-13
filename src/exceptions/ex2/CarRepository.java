package exceptions.ex2;

import java.util.List;

public interface CarRepository {
    void addCar(Car car);

    void removeCar(Car car) throws  CarNotFoundException;

    List<Car> searchForCarByName(String name) throws CarNotFoundException;

    List<Car> searchForCarById(String id) throws CarNotFoundException;

    void removeCarById(String id) throws CarNotFoundException;

    List<Car> getAllCars();

}
