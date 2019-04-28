



public class StaticConst {

    /*
    * 1. Class Specific => static
    * 2. Object specific => normal
    *
    * */

    public static void main(String[] args) {
        MyConstClass m1 = new MyConstClass(7);
        MyConstClass m2 = new MyConstClass(9);
        MyConstClass m3 = new MyConstClass(5);


        /*System.out.println(m1.a);
        System.out.println(m2.a);
        System.out.println(m3.a);

        System.out.println("Before change");

        System.out.println(m1.b);
        System.out.println(m2.b);
        System.out.println(m3.b);

        m1.b = 80;

        System.out.println("After change");

        System.out.println(m1.b);
        System.out.println(m2.b);
        System.out.println(m3.b);*/

        MyConstClass first = new MyConstClass(9,0);

        System.out.println("first: a=>"+first.a+" b=> " + first.b);

        MyConstClass second = new MyConstClass(3,8);

        System.out.println("first: a=>"+first.a+" b=> " + first.b);
        System.out.println("second: a=>"+second.a+" b=> " + second.b);

        MyConstClass third = new MyConstClass(15,3);

        System.out.println("first: a=>"+first.a+" b=> " + first.b);
        System.out.println("second: a=>"+second.a+" b=> " + second.b);
        System.out.println("third: a=>"+third.a+" b=> " + third.b);

        System.out.println(MyConstClass.b);

        /*
        * 1. same value for all object of same class
        * 2. can be accessed using Class name. without creating any object
        * 3. static variable or method can't use not-static variable or method
        * 4. non-static variable or method can use static method or variable*/

        int kk = MyConstClass.square(8);
        double pp = Math.sqrt(16);

        double pi = Math.PI;

        Person shams = new Person("Shams");
        Person mohi = new Person("Dewan");
        Person korim = new Person("Korim");


        /*
        * public
        * private
        * protected
        * default
        * */

        /*
        * Scope
        * */

        /*
        * this
        * */

        MySetGet mySetGet = new MySetGet(8, "Hello");

        //int a = mySetGet.a; // not recommended way
        int aa = mySetGet.getA(); // recommended way

        //mySetGet.a = 99; //not recommended way
        mySetGet.setA(99); // recommended way

        System.out.println( MyConstClass.b);

    }


}

class MySetGet{
    private int a;
    private String b;

    public MySetGet(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    /*
    * static
    * final
    * visibility
    * this
    * getter & setter
    * scope*/
}

class Person{
    final String name;
    final int PI = 89898;

    public Person(String name) {
        this.name = name;
    }
}

class MyConstClass {
    int a;
    final int k = 909;


    static int b=9;

    public MyConstClass(int a) {
        this.a = a;
    }

    public MyConstClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){

        this.plusWithA(9);
        return a;
    }

    public int plusWithA(int k){
        return a+k;
    }

    private static int majha(int k){

        return  k+k;

    }

    public static int square(int k){
        return k*k;
    }
}
