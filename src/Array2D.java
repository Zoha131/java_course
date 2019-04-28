import java.util.Scanner;

public class Array2D {

    



    /*
    * inside nested loop
    * first i represent row
    * second j represent column
    * */

    /*
    * when initializing 2d array
    * first [] represent row
    * second [] represent column
    * int a[][] = new int[8][5]
    * here row -> 8
    * column -> 5
    * */


    public static void main(String[] args) {
        int a[] = new int[8];

        int b[][] = new int[7][4];

        int value = 0;

        for (int i = 0; i < 7 ; i++) {
            b[i][2] = value++;

            /*
            * %d = int
            * %f = float
            * %s = string
            * %c = character
            * */


            System.out.printf("b[%d][%d]=%d   \n", i, 2, b[i][2]);
        }

        /*for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = value++;
                System.out.printf("b[%d][%d]=%d   ", i, j, b[i][j]);
            }
            System.out.println();
        }*/
    }



    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //column number
        int column = input.nextInt();


        String temp = input.nextLine();
        //character
        String s = input.nextLine();

        // 144 value
        int aa[][] = new int[15][15];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                aa[i][j] = input.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                if(column == j) sum += aa[i][j];

            }
        }

        *//*
        * types of variables
        *  1. built in variable
        *  eg int, float, double,char
        *
        *  2. Reference type variable
        *  eg. String, Custom Classes*//*

        if(s.equals("S")){
            System.out.println(sum);
        }else {
            double avg = sum/12.0;

            System.out.println(avg);
        }

    }*/
}


class MyIntDiv {
    public static void main(String[] args) {
        double a = 5/2;
        double b = (double)(5/2);
        double c = 5/2.0;

        System.out.printf("Both int: %f casting %f double div %f", a, b, c);
    }
}