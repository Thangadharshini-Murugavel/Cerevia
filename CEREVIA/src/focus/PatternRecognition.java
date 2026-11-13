
package focus;

import java.util.Scanner;

public class PatternRecognition extends FocusExercise {

    public PatternRecognition() {
        super("Pattern Recognition");
    }

    @Override
    public void start(Scanner s) {

        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        String[][] questions = {
            {"A, C, E, G, ?", "I"},
            {"AB, CD, EF, GH, ?", "IJ"},
            {"MONDAY, WEDNESDAY, FRIDAY, ?", "SUNDAY"},
            {"AZ, BY, CX, ?", "DW"},
            {"CAT, DOG, CAT, DOG, ?", "CAT"}
        };

        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("              PATTERN RECOGNITION");
        System.out.println("================================================");

        System.out.println("\nIdentify the rule behind each pattern.");
        System.out.println("Answer all five questions.");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n------------------------------------------------");
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i][0]);

            System.out.print("Your answer: ");
            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase(questions[i][1])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("Correct answer: " + questions[i][1]);
            }
        }

        showResult();

        System.out.println("\nKeep practising your pattern recognition skills!");
    }
}
