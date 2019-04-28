class MyClass {

    int a;
    static int b = 9; //single value for every object

    public static void main(String[] args) {
        MyClass object1 = new MyClass();

        char c = object1.getChar("jfskdfjakjf", 4);

        System.out.println(object1.getChar("HelloWorld", 4));

        /*object1.b = 0;
        MyClass object2 = new MyClass(6);
        MyClass object3 = new MyClass(9);

        int b = object1.myFun(5);

        System.out.println("Object1 "+object1.b);
        System.out.println("Object2 "+object2.b);
        System.out.println("Object3 "+object3.b);*/
    }

    public int myFun(int a){

        return a+a;
    }

    private char getChar(String ss, int index){
        //ss = "hello"
        char a = ss.charAt(index);
        return a;

    }

    private void muFun2(){
        int a = 5;
        System.out.println("muFun2");
    }



    /*
    * <visibility> <return type> <method name>(<arg type> <arg name>) {
    *
    *   <run code>
    *
    *   return <value with return type>
    *
    * }
    * */


    /*
    * summation
    * first value 1
    * Last value 5
    * return sum 1+2+3+4+5 */



}

class AnotherClass{
    int sqr(int a, int b){
        return a*a;
    }

    public static int sqrt(int a){
        return a*a;
    }
}
