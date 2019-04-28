import java.util.Scanner;

public class MyArray {

    int a = 8;

    int aa[] = new int[6];
    static int[] bb = new int[8];

    // type[] name = new type[<length>]

    static int bbb[] = {1,2,3,4,5};
    static float ccc[] = {1f,2f,3f,4f,5f};

    static String s[] = new String[7];
    static String ss[] = {"new val", "aro value"};


    public static void main(String[] args) {
        /*System.out.println(bb.length);
        System.out.println(bbb.length);
        System.out.println(ccc.length);
        System.out.println(s.length);
*/
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i <10 ; i++) {
            a[i] = scanner.nextInt();
        }

        a[9] = 9;

        a[0] = 8;



        int aa[] = new int[6];
        int[] bb = new int[8];

        bb[0] = 6;

        // type[] name = new type[<length>]

        int bbb[] = {1,2,3,4,5};
        float ccc[] = {1f,2f,3f,4f,5f};

        System.out.println(bbb[3]);







    }


}
