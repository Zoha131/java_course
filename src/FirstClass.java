import java.util.Scanner;

public class FirstClass {
    /*
    * Class -> BluePrint
    * Object -> Instance of the blueprint
    *
    * */

    /*
    * 1. Variable/property
    * 2. Method/Function
    * 3. Constructor
    *
    * */

    int a, b, c;
    String aa, bb, cc;
    double tt, rr, ss;

    private int sum(int a, int b){
        return a+b;
    }

    public FirstClass(int t, int k, int z){
        a = t;
        b = k;
        c = z;

        System.out.println("First Class constructor executing");
    }

    public void printAll(){
        System.out.println(a+"  "+b+" "+c);
    }


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        MyDoubleClaa objectTwo = new MyDoubleClaa(45,6);

        int anyvalue = objectTwo.a;

        FirstClass object = new FirstClass(1,2,3);

        object.printAll();
    }
}

class MyDoubleClaa{
    int a, b;

    Integer cc;

    double z = 8.8;
    Double zz = 8.88;

    public MyDoubleClaa(int k){
        a = k;
        System.out.println("hjaklfj");
    }

    public MyDoubleClaa(int k, int l){
        a = k;
        b = l;
        System.out.println("overloaded");

    }

    public void myMethod(){

    }

    int sum(int a, int b){
        return a+b;
    }
}
