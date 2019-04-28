public class MyArraySecond {

    public static void main(String[] args) {
        /*
        * array starts from 0*/

        int a[] = new int[5];
        int[] aa = new int[500];

        int cc[] = {1,2,3,4,5,6};

        float b[] = new float[9];

        System.out.println("Before inserting value: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("After inserting value: ");

        for (int i = 0; i < a.length ; i++) {
            //System.out.println(cc[i]);

            a[i] = i*i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        //System.out.println(cc.length);

        /*
        * <type> <name>[] = new <type>[<size>]
        * <type>[] <name> = new <type>[<size>]
        * */


        /*
        * int type array 5
        * user input
        *
        * */
    }

}
