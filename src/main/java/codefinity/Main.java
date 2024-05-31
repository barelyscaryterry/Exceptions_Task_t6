package codefinity;

public class Main {
    private static final ExceptionHandlingExercise exceptionHandlingExercise
            = new ExceptionHandlingExercise();
    public static void main(String[] args) {
        try {
            exceptionHandlingExercise.checkAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }
        try {
            exceptionHandlingExercise.printLength(null);
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }
    }
}