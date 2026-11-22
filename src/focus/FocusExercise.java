
package focus;

import progress.ProgressTracker;

public abstract class FocusExercise {

    protected String exerciseName;
    protected int score;
    protected int correctAnswers;
    protected int incorrectAnswers;

    // Constructor
    public FocusExercise(String exerciseName) {

        this.exerciseName = exerciseName;
        this.score = 0;
        this.correctAnswers = 0;
        this.incorrectAnswers = 0;
    }

    // Every exercise must implement this method
    public abstract void start(java.util.Scanner s);

    // Update score based on the answer
    protected void checkAnswer(boolean correct) {

        if (correct) {
            score++;
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
    }

    // Display final results
    protected void showResult() {

        int totalQuestions = correctAnswers + incorrectAnswers;

        System.out.println("\n================================================");
        System.out.println("                 🏆 TRAINING RESULT");
        System.out.println("================================================");
        System.out.println("Exercise       : " + exerciseName);
        System.out.println("Score          : " + score + "/" + totalQuestions);
        System.out.println("Correct        : " + correctAnswers);
        System.out.println("Incorrect      : " + incorrectAnswers);
        System.out.println("================================================");

        // Save exercise performance
        ProgressTracker.recordResult(
            exerciseName,
            score,
            correctAnswers,
            incorrectAnswers
        );
    }
}
