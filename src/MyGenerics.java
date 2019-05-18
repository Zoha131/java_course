import java.util.*;

class MyArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> data2 = new ArrayList<>();
        data.add(123);
        data.add(787);
        data.add(123);

        boolean b = data.contains(123);

        for (int i = 0; i < data.size() ; i++) {
            System.out.println(data.get(i));
        }

        for (Integer d : data) {
            System.out.println(d);
        }

        ArrayList<String> strData = new ArrayList<>();
        strData.add("wett");

        String str = "Hello";
        strData.add(str);

        ArrayList<MyPeople> pData = new ArrayList<>();
        pData.add(new MyPeople("abul", 18));

        MyPeople my = new MyPeople("Kuddus", 99);
        pData.add(my);
    }

}

class MyPeople{
    String name;
    int age;

    public MyPeople(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class AgainPeople extends MyPeople{

    private String data;

    public AgainPeople(String data, String name, int age) {
        super(name, age);

        this.data = data;
    }
}

class MySet{
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>();
        data.add(123);
        data.add(787);
        data.add(123);


        System.out.println(data.size());

        for (Integer d : data) {
            System.out.println(d);
        }

        /*
        * arraylist maintains the serial
        * set do not maintain the serial
        * set ensures the unique value
        * */

        /*
        * enhance for loop
        *
        * for(Type name : collection){
        *
        * }
        *
        * */
    }
}

class MyMap {
    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();

        data.put(191, "Room 1");
        data.put(181, "Room 2");
        data.put(111, "Room 4");


       /* for (int i = 0; i < data.size() ; i++) {

        }

        Set<Integer> keyset = data.keySet();

        for (Integer integer : keyset) {
            System.out.println("Key: "+integer+ " value "+data.get(integer));
        }*/

       HashMap<String, MyPeople> mydata = new HashMap<>();

        mydata.put("photoshope", new MyPeople("shams", 12));
        mydata.put("pagol", new MyPeople("dewan", 12));
        mydata.put("dudu", new MyPeople("kfjsakjf", 12));

        System.out.println(mydata.get("pagol").name);

        mydata.put("pagol", new MyPeople("gulu gulu", 12));
        System.out.println(mydata.get("pagol").name);
    }
}

class MyGenaric<P, K, L, M>{
    private P value;
    private K value2;
    private L value3;
    private M value4;

    public MyGenaric() {

    }

    public MyGenaric(P value, K value2, L value3, M value4) {
        this.value = value;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public P getValue() {
        return value;
    }

    public void setValue(P value) {
        this.value = value;
    }

    public K getValue2() {
        return value2;
    }

    public void setValue2(K value2) {
        this.value2 = value2;
    }

    public L getValue3() {
        return value3;
    }

    public void setValue3(L value3) {
        this.value3 = value3;
    }

    public M getValue4() {
        return value4;
    }

    public void setValue4(M value4) {
        this.value4 = value4;
    }
}


class GenericAgain<P extends MyPeople>{
    private P value;

    public GenericAgain() {
    }

    public GenericAgain(P value) {
        this.value = value;


    }

    public P getValue() {
        return value;
    }

    public void setValue(P value) {
        this.value = value;
    }
}

class FunGeneric{
    private String pagol;

    public FunGeneric(String pagol) {
        this.pagol = pagol;
    }

    public String getPagol() {
        return pagol;
    }

    public void setPagol(String pagol) {
        this.pagol = pagol;
    }

    public <P extends MyPeople> void setMamu(P value){
        P value1;
        System.out.println(value.getClass().getName());
    }

}

/*
* class generics
* class {Name}<letter> {
*   << now you can use letter as type >>
* }
*
* visibility <letter> {return type} {function name}(){
*
* }
*
* function generics
*
*
* you can use multiple letter
* */

class MyMain{
    public static void main(String[] args) {
        MyPeople myPeople = new MyPeople("Shams", 19);

        FunGeneric funGeneric = new FunGeneric("Pagol");

        funGeneric.getPagol();

        funGeneric.<MyPeople>setMamu(myPeople);

        AgainPeople againPeople = new AgainPeople("pagol", "dewan", 123);

        GenericAgain<AgainPeople> again = new GenericAgain<>();



        MyGenaric<String, Integer, Double, Boolean> strData =
                new MyGenaric<>("Hello",
                            123, 123.4, false);


    }
}

/*
* Collection
* List -> ArrayList
* add(), addAll(), remove(), clear(), get(), size()
* maintain the serial
* do not guarantee uniqueness
*
* Set -> HashSet
* every value is unique
* do not maintain serial
*
* Map -> HashMap
* has key & value
* key is always unique
* key class has to implement hashCode method
*
* <<Last topic of Java>>
* Generics
*
*
* */



