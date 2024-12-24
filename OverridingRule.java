package exceptionHandeling;

import java.io.FileNotFoundException;
import java.io.IOException;

/*  To follow the rule correctly, you should either:
    Not declare any exception (if the superclass method doesn't require throwing an exception in the overriding method).
    Declare the same exception type or a subclass of the exception type thrown by the parent.
 */
class Parent{
    public void add() throws ArrayIndexOutOfBoundsException {
        System.out.println("add method  throwing ArrayIndexOutOfBoundsException exception...");
        int[] ar = {1,2,5,7,8,9};
        int a = ar[10];
        System.out.println(a);
    }
}
public class OverridingRule extends Parent{
    @Override
    public void add() throws IndexOutOfBoundsException {
        super.add();
        System.out.println("overridden add method");
    }
    public static void main(String[] args) {
        Parent overridingRule = new OverridingRule();
        overridingRule.add();
    }
}
