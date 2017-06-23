package codelab.com.mylibrary.basic.constructor;

/**
 * Created by WhiteTec on 2017/6/23.
 */

public class Child extends Base {

    public Child() {
        System.out.println("child");
    }


    public static void main(String[] args){
        System.out.println("child + " + "    + main");

        Child child = new Child();

        Person person = new Person("jack","jj");
    }

}
