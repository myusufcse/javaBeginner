package Inher;

public class Triangle extends Drawable {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.size = 3;
        triangle.shape = "triangle";
        triangle.draw();
    }
}
