import newPackage.NewClass;

public class ClassObject {
    private int a = 8;
    protected int b = 9;
    public int c = 9;


    public static void main(String[] args) {
        int a = 6;
        ClassObject classObject = new ClassObject();
        NewClass newClass = new NewClass();

        System.out.println(classObject.a);
        System.out.println(classObject.b);
        System.out.println(classObject.c);
    }

    class HelloClass {

    }
}


