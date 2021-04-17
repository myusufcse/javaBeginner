package interf;

public class ChildForAbs extends AbsClass {
    int a = 6;

    @Override
    public int squareNumber(int num) {
        return (int) Math.pow(num,2); // num * num
    }

    @Override
    public int squareNumber(int num, int num1) {
        return num*num1;
    }

    public static void main(String[] args) {
        ChildForAbs cfa = new ChildForAbs();
        System.out.println(cfa.squareNumber(5));
        System.out.println(cfa.a);

        System.out.println(cfa.isDivisibleByFive(56));
    }
}
