import java.util.Scanner;

public class OverLoad {

    /*
    * Multiple method with the same name
    * But parameter sequence must be unique for every method
    * parameter type sequence must be unique.
    * parameter name doesn't matter
    * You can also change return type & visibility
    * */

    public int sum(int a, int b){ //int, int
        return a+b;
    }

    public float sum(float t, int b){ // float, int
        return 5.0f;
    }

    public float sum(int b, float a){ // float, int
        return 5.0f;
    }

    private float sum(float e, int b, String t){ //float, int, String
        return 5.0f;
    }

    public int sum(int a, int b, int c){ //int, int, int
        return a+b+c;
    }

    private int multiple(int a, int b){
        return a*b;
    }

    /*
    * sum
    * multiple
    * minus
    * divide
    * remainder
    * */

    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();

        int a = overLoad.sum(1,2);
        int b = overLoad.sum(1,2,3);

        System.out.println(5);
        System.out.println(5.6);
        System.out.println('c');



        Scanner input = new Scanner(System.in);

        int aa = input.nextInt();
        double bb = input.nextDouble();
        long cc = input.nextLong();
    }
}
