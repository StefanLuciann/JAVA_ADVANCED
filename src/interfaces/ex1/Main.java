package interfaces.ex1;

/**
 * Create a interface 'Graphic' that encapsulates the fallowing method:
 * - draw()
 * <p>
 * Based on this interface implement two classes:
 * - Line: which should print at System out a line
 * <p>
 * ` "------------"`
 * <p>
 * - Square: which should print at System out a square:
 * <p>
 * `    --------
 * |      |
 * |      |
 * --------`
 * <p>
 * - Text: which should print at System out a text
 * <p>
 * Create a Main class where you should initialize an Array of type Graphic with different implementations (Line, Square, Text).
 * Next, with a foreach call the draw() method on each of the array objects.
 */
public class Main {

    public static void main(String[] args) {

        Graphic[] graphics = new Graphic[3];
        graphics[0] = new Line();
        graphics[1] = new Square();
        graphics[2] = new Text("This value");

        drawElements(graphics);
    }


    public static void drawElements(Graphic[] graphics) {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
