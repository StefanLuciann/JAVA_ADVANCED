package inheritance.ex2;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * Which fields and methods are common?
 */
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3);
        circles[1] = new Circle(5);
        for (Circle circle : circles) {
            System.out.println(circle);

        }
        System.out.println("---------------------------------------------");
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(6,3);

        for(Shape shape : shapes){
            System.out.println("Perimetre : "+ shape.getPerimeter());
            System.out.println("Area : "+ shape.getArea());
        }

    }

}
