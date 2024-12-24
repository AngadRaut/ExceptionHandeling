package exceptionHandeling;

public class FinallyBlockTest {
    public int test(){
        try{
            System.out.println("try block");
            System.out.println(100/1);
            return 100;

//            System.out.println("nana");    /Unreachable statement
        }catch (ArithmeticException  |  NullPointerException exception){
            System.out.println("catch block");
            exception.printStackTrace();
            System.out.println("catch block 2nd statement...");
            return 200;
//            System.exit(0);
        }finally {
            System.out.println("finally block");
            return 400;
        }
//        return 300;
    }
    public static void main(String[] args) {
      FinallyBlockTest test = new FinallyBlockTest();
        System.out.println(test.test());
    }
}
