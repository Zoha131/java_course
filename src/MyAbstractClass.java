
public class MyAbstractClass {

    /*
    * variable
    * methods
    * constrictors*/

    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2(4, true);

        /*Animal dada = new Fish();
        dada.eat("something");
        dada.move();

        Animal human = new Human();
        human.eat("Rice");*/

        //MyAbsClass myAbsClass = new MyAbsClass();


    }

}

class MyAbsExtendClass extends MyAbsClass{

    private  double trial;

    @Override
    public int trialAbstract() {
        return 0;
    }

    @Override
    public int hihello() {
        return 0;
    }

    @Override
    public int trial8() {
        return 0;
    }
}

abstract class MyAbsClass{
    /*
    * abstract class can have abstract method
    * you can't create a object of abstract class
    * using new keyword
    * */

    /*
    * concrete class
    * abstract class*/

    int a;
    int b;
    int c;

    public MyAbsClass() {
        this.a = a;
    }

    public int myMethod(int a){
        return a+a;
    }

    public abstract int trialAbstract();
    public abstract int hihello();
    public abstract int trial8();
}

abstract class Animal{
    private String name;
    private double height;

    public void move(){
        System.out.println("Moving");
    }

    public abstract void eat(String food);
}

class Human extends Animal {

    @Override
    public void eat(String food) {
        System.out.println("Eat using hand "+food);
    }

}

class Fish extends Animal{

    @Override
    public void eat(String food) {
        System.out.println("Eat using only mouth "+food);
    }
}

class MyClass2 {
    private int a;
    private boolean b;

    public MyClass2(int a, boolean b) {
        this.a = a;
        this.b = b;
    }

    public MyClass2(){
        this.a = 9;
        this.b = false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}


/*
* Create an abstract class called GeoMetricObject
* which will have two abstract method to get area and parameter
*
*
* create Circle class with radius variable and extend GeoMetricObject
*
* Create Rectangle class with height and width variable and extend GeoMetricObject
*
* Use appropriate getter and setter and constrictors
*
* Circle Area = pi*r*r
* Circle Perimeter = 2*pi*r
*
* Rectangle Area = height * width
* Rectangle Perimeter = 2*(height+width)
*
* */

