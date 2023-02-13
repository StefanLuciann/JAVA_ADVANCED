package Homework.Ex14;

import java.util.List;

class Model {
    private String name;
    private int productionStartYear;
    List <Car>cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public void setProductionStartYear(int productionStartYear) {
        this.productionStartYear = productionStartYear;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                ", cars=" + cars +
                '}';
    }
}
