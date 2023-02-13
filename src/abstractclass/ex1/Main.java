package abstractclass.ex1;
/**
 a. Write an abstract class Shape
 – Data members: numSides
 – Constructor: initialize numSides
 – Concrete method: get method for numSides
 – Abstract methods: getArea(), getPerimeter()
 b. Write a concrete subclass Rectangle
 – Data members: width, height
 c. Write a concrete subclass Triangle
 – Data members: width, height*/
public class Main {
    public static void main(String[] args) {

    Shape triangle = new Triangle(3,4.5);
    Shape rectangle = new Rectangle(9,8.8);
    triangle.compareShapeByPerimeter(rectangle);
    triangle.compareShapeByArea(rectangle);

}
}
