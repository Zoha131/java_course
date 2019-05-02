
/*Topic List
 * ==========
 * extend keyword
 * why inheritance
 * this keyword
 * super keyword
 * overriding
 * overriding vs overloading
 *
 *
 * Polymorphism
 * instanceof keyword
 * type casting
 * */


/*Extendable
 * 1. Class
 * 2. abstract class
 * 3. interface
 * */


/*
* Student
* Staff
* Teacher
* Cleaner
* Driver
* Doctor
* */

/*
 * default
 * protected
 * public
 * */

public class Inheritance {

    private int aa;
    private double point;
    public String name = "Inheritance";

    public Inheritance(int aa, double point, String name) {
        this.aa = aa;
        this.point = point;
        this.name = name;
    }

    public Inheritance(int aa, double point) {
        this(aa, point, "Mjaha");
    }


    public void myargMethod(String a, int b){
        System.out.println("String: "+a+" int: "+b);
    }

    public void myMethod(){
        System.out.println("Hello from Inheritance class");
    }
}

class ExtendTrial extends Inheritance {

    /*
    * this key use-case
    * 1. using like object so that you can access
    * variables and method with dot (.) notation
    *
    * 2. using as constructor method so that u
    * can call another constructor from different constructor
    *
    * super keyword also can be use two ways.
    * which is similar as this keyword
    *
    * when using this or super as constructor method,
    * this(..) or super(...) must be first statement
    * of that constructor method
    *
    * this(..) and super(..) can't be use at the same time
    * */

    private int number;
    private String topic;

    public ExtendTrial(int number, String topic, double anotherParam) {
        super(34, 5.9); // must be in first line
        this.number = number;
        this.topic = topic;

    }

    public ExtendTrial(int number, String topic) {
        super(4, 8.9, "Super");

        this.number = number;
        this.topic = topic;
    }

    public ExtendTrial(){
        this(343, "Java", 89.9);
    }

    public void extendPrint(){
        System.out.println("Hello from ExtendTrial class");
    }

    public void myTrial(){
        extendPrint();
        super.myMethod();
        super.myargMethod("hello", 7);

        System.out.println(name);
        //System.out.println(aa);
    }

    @Override
    public void myMethod() {
        super.myMethod();
    }

    @Override
    public void myargMethod(String a, int b) {
        super.myargMethod(a, b);
    }
}

class MainInheritance {
    public static void main(String[] args) {
        ExtendTrial a = new ExtendTrial();
        a.myMethod();

        System.out.println(a.name);
        //System.out.println(a.aa);
    }
}
