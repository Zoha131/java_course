import java.util.Scanner;
import java.lang.Math;

class Main {

    int a, b;

    public Main(){
        a=0;
        b=0;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Main i = new Main();
        double A, B, C, X, Y;
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();

        if (A == 0 || ((B*B)-(4*A*C))<0) {

            System.out.println("Impossivel calcular");

        } else {
            X = i.Vaskarap(A, B, C);
            System.out.printf("R1 = %.5f\n", X);
            Y = i.Vaskaram(A, B, C);
            System.out.printf("R2 = %.5f\n", Y);

        }
    }

    public double Vaskarap(double k, double g, double f) {

        double j = (-g + Math.sqrt((g * g) - 4 * k * f)) / (2 * k);
        return j;
    }

    public double Vaskaram(double k, double g, double f) {

        double l = (-g - Math.sqrt((g * g) - 4 * k * f)) / (2 * k);
        return l;
    }

}
