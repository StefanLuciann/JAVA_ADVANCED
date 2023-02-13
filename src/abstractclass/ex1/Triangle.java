package abstractclass.ex1;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height/2;
    }

    @Override
    public double getPerimeter() {
        return width+height;
    }

    @Override
    public String toString() {
        return "Triangle : " +
                " Width = " + width +
                " | height=" + height;
    }
}
