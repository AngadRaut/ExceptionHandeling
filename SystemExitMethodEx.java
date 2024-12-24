package exceptionHandeling;

public class SystemExitMethodEx {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided. Exiting the program.");
            System.exit(1);  // Exit with status code 1 (error)
        }
        System.out.println("Program running with arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.exit(4);  // Normal exit with status code 0
    }
}
