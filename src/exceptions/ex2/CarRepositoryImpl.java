package exceptions.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {

    private final List<Car> cars = new ArrayList<>();


    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void removeCar(Car car) throws CarNotFoundException {
        if (!cars.remove(car)) {
            throw new CarNotFoundException("Car with id " + car.getId() + " was not found");
        }
    }

    @Override
    public List<Car> searchForCarByName(String name) throws CarNotFoundException {
        List<Car> carsFound = new ArrayList<>();
        for (Car car : cars) {
            if (car.getName().equals(name)) {
                carsFound.add(car);
            }
        }
        if (carsFound.isEmpty()) {
            throw new CarNotFoundException("No cars were found");
        }
        return carsFound;
    }

    @Override
    public List<Car> searchForCarById(String id) throws CarNotFoundException {
        List<Car> carsFound = new ArrayList<>();
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                carsFound.add(car);
            }
        }
        if (carsFound.isEmpty()) {
            throw new CarNotFoundException("No cars were found");
        }
        return carsFound;
    }

    @Override
    public void removeCarById(String id) throws CarNotFoundException {
        List<Car> carsFound = searchForCarById(id);
        for (Car car : carsFound) {
            removeCar(car);
        }
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
