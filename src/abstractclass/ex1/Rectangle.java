package abstractclass.ex1;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double height,double width) {
        super(4);
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);

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
    public String toString() {
        return "Rectangle " +
                " Width = " + width +
                " | Height = " + height
               ;
    }
}
