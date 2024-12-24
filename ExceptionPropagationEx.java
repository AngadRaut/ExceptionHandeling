package exceptionHandeling;

public class ExceptionPropagationEx {
    static void outerMethod() throws CustomException {
        try {
            innerMethod();
        } catch (CustomException e) {
            System.out.println("Caught CustomException in outerMethod: " + e.getMessage());
            throw e; // Re-throwing the exception
        }
    }

    static void innerMethod() throws CustomException {
        // Some risky operation that might throw CustomException
        throw new CustomException("This is a custom exception!");
    }

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            outerMethod();
        } catch (CustomException e) {
            System.out.println("Caught CustomException in main: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

