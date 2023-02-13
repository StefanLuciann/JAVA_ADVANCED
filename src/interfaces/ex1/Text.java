package interfaces.ex1;

public class Text implements Graphic {
    private String value;


    public Text(String value) {
        this.value = value;
    }



    @Override
    public void draw() {
        System.out.println(value);
    }
}
