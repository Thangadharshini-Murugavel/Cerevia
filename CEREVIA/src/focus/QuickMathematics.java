
package focus;

import java.util.Scanner;

public class QuickMathematics extends FocusExercise {

    public QuickMathematics() {
        super("Quick Mathematics");
    }

    @Override
    public void start(Scanner s) {

        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        int[][] questions = {
            {25, 15, 40},
            {12, 8, 96},
            {144, 12, 12},
            {75, 25, 50},
            {15, 15, 225}
        };

        String[] operators = {
            "+", "×", "÷", "-", "×"
        };

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("                ⚡ QUICK MATHEMATICS");
        System.out.println("╚══════════════════════════════════════════════╝");

        System.out.println("\n🎯 Solve the calculations accurately.");
        System.out.println("📝 Answer all five questions.");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Question " + (i + 1) + ": "
                    + questions[i][0] + " "
                    + operators[i] + " "
                    + questions[i][1] + " = ?");

            System.out.print("👉 Your answer: ");

            String answer = s.nextLine().trim();

            try {
                int userAnswer = Integer.parseInt(answer);

                if (userAnswer == questions[i][2]) {
                    checkAnswer(true);
                } else {
                    checkAnswer(false);
                    System.out.println("💡 Correct answer: " + questions[i][2]);
                }

            } catch (NumberFormatException e) {
                checkAnswer(false);
                System.out.println("❌ Please enter a valid number.");
                System.out.println("💡 Correct answer: " + questions[i][2]);
            }
        }

        showResult();

        System.out.println("\n🌟 Practise mental mathematics to improve your speed!");
    }
}
