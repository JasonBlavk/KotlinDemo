package benny.unit;

/**
 * Created by WhiteTec on 2017/6/29.
 */

public class Jv05 {

    // psvm for sout
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
        }

        System.out.println(EnumInJava.china);
    }



}

enum EnumInJava{
    china,
    japan,
    korea
}