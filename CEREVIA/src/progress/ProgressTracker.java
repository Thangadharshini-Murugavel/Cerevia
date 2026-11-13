
package progress;

public class ProgressTracker {

    private static final String[] EXERCISES = {
        "Memory Challenge",
        "Pattern Recognition",
        "Attention Test",
        "Logical Thinking",
        "Quick Mathematics",
        "Sequence Challenge"
    };

    private static int[] attempts = new int[6];
    private static int[] bestScores = new int[6];
    private static int[] correctAnswers = new int[6];
    private static int[] incorrectAnswers = new int[6];

    // Record the result of an exercise
    public static void recordResult(String name, int score,
                                    int correct, int incorrect) {

        for (int i = 0; i < EXERCISES.length; i++) {

            if (EXERCISES[i].equals(name)) {

                attempts[i]++;

                if (score > bestScores[i]) {
                    bestScores[i] = score;
                }

                correctAnswers[i] += correct;
                incorrectAnswers[i] += incorrect;

                break;
            }
        }
    }

    // Display overall progress
    public static void showProgress() {

        int totalAttempts = 0;
        int totalCorrect = 0;
        int totalIncorrect = 0;
        int completedExercises = 0;

        for (int i = 0; i < EXERCISES.length; i++) {

            totalAttempts += attempts[i];
            totalCorrect += correctAnswers[i];
            totalIncorrect += incorrectAnswers[i];

            if (attempts[i] > 0) {
                completedExercises++;
            }
        }

        int totalAnswers = totalCorrect + totalIncorrect;

        double accuracy = totalAnswers == 0
                ? 0
                : (totalCorrect * 100.0) / totalAnswers;

        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("                 PROGRESS CENTRE");
        System.out.println("================================================");

        System.out.println("\nOVERALL PERFORMANCE");
        System.out.println("----------------------------------------------");

        System.out.println("Exercises Completed : " + completedExercises + "/6");
        System.out.println("Total Attempts      : " + totalAttempts);
        System.out.println("Correct Answers     : " + totalCorrect);
        System.out.println("Incorrect Answers   : " + totalIncorrect);
        System.out.printf("Accuracy            : %.2f%%\n", accuracy);

        System.out.println("\nINDIVIDUAL PERFORMANCE");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < EXERCISES.length; i++) {

            System.out.println("\n" + (i + 1) + ". " + EXERCISES[i]);
            System.out.println("   Attempts       : " + attempts[i]);
            System.out.println("   Best Score     : " + bestScores[i] + "/5");
            System.out.println("   Correct        : " + correctAnswers[i]);
            System.out.println("   Incorrect      : " + incorrectAnswers[i]);
        }

        System.out.println("\n================================================");
        System.out.println("             KEEP IMPROVING!");
        System.out.println("================================================");
    }
}
