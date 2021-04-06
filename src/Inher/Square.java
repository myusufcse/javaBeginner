package Inher;

public class Square extends Drawable{
    int a;
    public void draw() {
        super.draw();
        System.out.println("override the  " + shape +" with size of " + size);
    }
    public static void main(String[] args) {
        Square square = new Square();
        square.a = 8;
        square.size = 5;
        square.shape = "Square";
        //
        System.out.println(Drawable.name);
        square.draw();

    }
}
