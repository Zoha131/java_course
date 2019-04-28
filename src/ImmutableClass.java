


public class ImmutableClass {

    private int a;
    private boolean b;
    private double c;

    public ImmutableClass(int a, boolean b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public boolean isB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

class MyMutableClass {
    private int a;
    private int b;
    private double c;

    private String e;

    public MyMutableClass(int a, int b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}


class ImmutableTest{
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(30, true, 8.99);
        ImmutableClass immutableClass2 = new ImmutableClass(9, false, 77.00);

        MyMutableClass myMutableClass = new MyMutableClass(9,9, 9.00);

        MyMutableClass mutingTest = myMutableClass;

        MyMutableClass helloT = mutingTest;

        System.out.println(myMutableClass.getA());

        mutingTest.setA(909);

        System.out.println(myMutableClass.getA());


        String hello = "hello";

        hello = "Hi Hello";


    }
}







































