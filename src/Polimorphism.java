/*
 * Polymorphism
 * instanceof keyword
 * type casting
 * Generics
 *
 * */

/*
 * Polymorphism means that a variable
 * of a supertype can refer to a
 * subtype object
 * */


import java.util.ArrayList;
import java.util.List;

class Generics{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
    }
}

public class Polimorphism {

    public static void main(String[] args) {
        SuperType a = new SubType();
        //a.call();

        Callback p = new ViewCallback();
        Callback q = new TouchCallback();

         //p.viewExtra();

         if(p instanceof ViewCallback){
             System.out.println("p is a object of ViewCallback");

             ViewCallback l = (ViewCallback) p;
             l.viewExtra();

         } else {
             System.out.println("P is not a object of ViewCallback");
         }

         p.call();

    }

}

interface Callback {
    void call();
}

class ViewCallback implements Callback {

    @Override
    public void call() {
        System.out.println("ViewCallback");
    }

    public void viewExtra(){
        System.out.println("ViewExtra function");
    }
}

class TouchCallback implements Callback {

    @Override
    public void call() {
        System.out.println("TouchCallback");
    }

    public void touchExtra(){
        System.out.println("TouchExtra function");
    }
}

/*
 * TouchCallback <interface>
 *     ImageTouchCallback
 * */

interface SwipeCallback {
    void swipe();
}

class View{
    SwipeCallback swipeCallback;

    public SwipeCallback getSwipeCallback() {
        return swipeCallback;
    }

    public void setSwipeCallback(SwipeCallback swipeCallback) {
        this.swipeCallback = swipeCallback;
    }
}
class ImageView extends View{

    public void setSwipeCallback(ImageSwipe swipeCallback) {
        super.setSwipeCallback(swipeCallback);
    }
}

class TextView extends View{

}

class ImageSwipe implements SwipeCallback{

    @Override
    public void swipe() {
        System.out.println("Image is being swiped");
    }
}

class TextSwipe implements SwipeCallback{

    @Override
    public void swipe() {
        System.out.println("TextView is being swiped");
    }
}

/*
 * tap
 * swipe
 * tap & hold
 * */

class SuperType {
    public void call() {
        System.out.println("Executed from supertype");
    }
}

class SubType extends SuperType {
    @Override
    public void call() {
        System.out.println("Executed from subtype");
    }
}


