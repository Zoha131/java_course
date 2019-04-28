import java.util.Scanner;

public class MethodOverLoad {
    //a= 4+3
    //a= 4+8+9

    public int sum(int a, int b){
        return a+b;
    }

    private int sum(int c, int d, int r){
        return c+d+r;
    }

    public double sum(float c, int d, int r){

        float a = c+d;

        double dd = a/r;

        return dd;
    }

    protected float sum(int c, float d, int r){
        return c+d+r;
    }


    double sum(int c, int d, int r, int k){
        return c+d+r+k;
    }

    /*
    * method names must be same
    * parameter sequence must be unique
    * parameter type sequence must be unique
    * parameter names do not have any effect
    *
    * visibility and return type can also be changed
    * */

    /*
    * sum
    * multiply
    * division
    * minus*/

    public static void main(String[] args) {
        MethodOverLoad method = new MethodOverLoad();

        int a = method.sum(4,5);
        int b = method.sum(1,2,3);

        System.out.println(4);
        System.out.println('c');
        System.out.println(45.6f);
        System.out.println("Hello");


        Scanner input = new Scanner(System.in);

        String aaaa = input.next();
    }
}
