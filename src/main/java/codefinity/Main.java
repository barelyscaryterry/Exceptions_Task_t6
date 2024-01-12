package codefinity;

public class Main {
    private static final ExceptionHandlingExercise exceptionHandlingExercise
            = new ExceptionHandlingExercise();
    public static void main(String[] args) {
        exceptionHandlingExercise.checkAge(17);
        exceptionHandlingExercise.printLength(null);
    }
}