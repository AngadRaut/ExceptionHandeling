package exceptionHandeling;

import java.io.File;

public class ThrowsKeyword {
    public static void main(String[] args) throws ClassNotFoundException,ArithmeticException {


        System.out.println("division is = "+(1/0));
        Class cl = Class.forName("nana");
       /* try {
            Class cl = Class.forName("nana");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/

    }
}
