package interf;

public abstract class AbsClass {

    public AbsClass() {
        System.out.println("I am Abs Class Constructor");
    }

    abstract int squareNumber(int num);
    public abstract int squareNumber(int num, int num1);

    public boolean isDivisibleByFive(int num) {
        return (num % 3 == 0);
    }
}
