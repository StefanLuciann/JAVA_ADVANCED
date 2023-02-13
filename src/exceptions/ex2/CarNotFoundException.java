package exceptions.ex2;

public class CarNotFoundException extends Exception{
    public CarNotFoundException(String message) {
        super(message);
    }
}
