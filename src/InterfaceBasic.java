

public interface InterfaceBasic {

    public static final String VARB = "value";
    int MYCONST = 909;

    public abstract int getDouble(int a);
    double getSquare(int a);

    /*
    * it contains 2 part
    * 1. Constant
    *       constant must be Public static final
    * 2. abstract method
    *       method must be public abstract
    *
    * You can implement more than one interfaces
    * */

    /*
    *
    * Naming convention
    * Class => Noun
    * Interface => Adjective
    *
    * */

}

class People implements Comparable<People>{

    @Override
    public int compareTo(People o) {
        return 0;
    }
}

interface Clickable{
    void onClick();
}

interface Focusable{
    void onFocus();
}

class MyView implements Clickable, Focusable{


    @Override
    public void onClick() {

    }

    @Override
    public void onFocus() {

    }
}

class ListView implements Clickable{

    @Override
    public void onClick() {

    }
}


class InterfaceTest{
    public static void main(String[] args) {
        //MyAbsClass myAbsClass = new MyAbsClass();
        MyAbsClass myAbsClass = new MyAbsImp();

        //anonymous class
        MyAbsClass myAbsClass2 = new MyAbsClass() {
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
        };
    }
}

class MyAbsImp extends MyAbsClass implements Clickable, Focusable {


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

    @Override
    public void onClick() {

    }

    @Override
    public void onFocus() {

    }
}


/*
* 1. Create an interface
* 2. Implement that interface in a class
* 3. Create an object of that class
*
* */

/*
* Inheritance & Polymorphism
* Generics
*
* */
