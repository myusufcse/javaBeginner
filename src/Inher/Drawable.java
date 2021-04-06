package Inher;

class Drawable {
    // It will create a error in subclass and class where we are creating obj for this class
    // private Drawable() {}
    static String name = "Drawable Class";
    int size;
    String shape;
    public void draw() {
        System.out.println("Draw the shape \"" + shape +"\" with size of \"" + size + "\"");
        //Draw the shape "triangle" with size of "3"

    }
}
