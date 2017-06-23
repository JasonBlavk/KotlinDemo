package codelab.com.mylibrary.function;

/**
 * Created by WhiteTec on 2017/5/27.
 */

public class Jack {

    private int age;
    private String name;

    public Jack(int age, String name) {
        this.age = age;
        this.name = name;
    }


    private Jack Copy(int age, String name)
    {
        return new Jack(this.age, this.name);
    }
}
