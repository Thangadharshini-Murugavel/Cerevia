
package focus;

import java.util.Scanner;

public class SequenceChallenge extends FocusExercise {

    public SequenceChallenge() {
        super("Sequence Challenge");
    }

    @Override
    public void start(Scanner s) {

        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        String[][] questions = {
            {"1, 2, 3, 4, ?", "5"},
            {"2, 4, 8, 16, ?", "32"},
            {"10, 20, 30, 40, ?", "50"},
            {"1, 1, 2, 3, 5, ?", "8"},
            {"81, 27, 9, 3, ?", "1"}
        };

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("                🔢 SEQUENCE CHALLENGE");
        System.out.println("╚══════════════════════════════════════════════╝");

        System.out.println("\n🎯 Identify the rule behind each sequence.");
        System.out.println("📝 Find the missing number in all five questions.");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Question " + (i + 1) + ": "
                    + questions[i][0]);

            System.out.print("👉 Your answer: ");
            String answer = s.nextLine().trim();

            if (answer.equals(questions[i][1])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Correct answer: " + questions[i][1]);
            }
        }

        showResult();

        System.out.println("\n🌟 Keep challenging your brain!");
    }
}
