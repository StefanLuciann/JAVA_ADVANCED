package exceptions.ex2;

/**
 * Create the CarRepository class, which will be responsible for:
 * - adding Car objects
 * - removing Car objects
 * - searching for objects of the Car type with the indicated name
 * - searching for objects of the Car type with the indicated id
 * - removing objects of the Car type based on the provided id
 *
 * The Car class should include the following:
 * - id
 * - name
 * - year of production
 *
 * In case of lack of searched results an exception should be thrown. This
 * exception should accept the String parameter object with information about
 * which elements could not be found.
 */
public class Main {
    public static void main(String[] args) {
        CarRepository carRepository= new CarRepositoryImpl();
        Car car1=new Car("333","fORD", 2022);
        Car car2=new Car("232","audi",2021);
        Car car3=new Car("111","toyota",2044);

        carRepository.addCar(car1);
        carRepository.addCar(car2);
        carRepository.addCar(car3);

        System.out.println(carRepository.getAllCars());

        try {
            carRepository.searchForCarById("oooo");
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(carRepository.searchForCarById("333"));
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(carRepository.searchForCarByName("audi"));
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }
        try {
            carRepository.removeCarById("111");
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }
        try {
            carRepository.removeCar(car1);
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(carRepository.getAllCars());
    }
}
