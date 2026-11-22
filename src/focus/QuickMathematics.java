
package focus;

import java.util.Scanner;

public class QuickMathematics extends FocusExercise {

    public QuickMathematics() {
        super("Quick Mathematics");
    }

    @Override
    public void start(Scanner s) {

        // Reset previous scores
        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        String[] banner = {
            "",
            "╔══════════════════════════════════════════════╗",
            "                ⚡ QUICK MATHEMATICS",
            "╚══════════════════════════════════════════════╝",
            "",
            "🎯 Solve the calculations accurately!",
            "🧠 Improve your speed and calculation skills."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Questions",
            "2. 🟡 Intermediate - 5 Questions",
            "3. 🔴 High Level - 7 Questions",
            "E. 🚪 Exit Game"
        };

        // Format: First number, Second number, Answer
        int[][] basicQuestions = {
            {8, 4, 12},
            {9, 3, 27},
            {20, 5, 4}
        };

        String[] basicOperators = {
            "+", "×", "÷"
        };

        int[][] intermediateQuestions = {
            {25, 15, 40},
            {12, 8, 96},
            {144, 12, 12},
            {75, 25, 50},
            {15, 15, 225}
        };

        String[] intermediateOperators = {
            "+", "×", "÷", "-", "×"
        };

        int[][] highQuestions = {
            {125, 25, 150},
            {18, 12, 216},
            {225, 15, 15},
            {250, 75, 175},
            {24, 16, 384},
            {360, 12, 30},
            {45, 15, 3}
        };

        String[] highOperators = {
            "+", "×", "÷", "-", "×", "÷", "÷"
        };

        for (String line : banner) {
            System.out.println(line);
        }

        System.out.println("\n📊 SELECT DIFFICULTY LEVEL");

        for (String level : levels) {
            System.out.println(level);
        }

        String choice;

        while (true) {

            System.out.print("\n👉 Enter your choice: ");
            choice = s.nextLine().trim();

            if (choice.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Quick Mathematics...");
                return;
            }

            if (choice.equals("1") || choice.equals("2")
                    || choice.equals("3")) {
                break;
            }

            System.out.println("❌ Invalid choice! Select 1, 2, 3 or E.");
        }

        int[][] questions;
        String[] operators;

        switch (choice) {

            case "1":
                questions = basicQuestions;
                operators = basicOperators;
                System.out.println("\n🟢 BASIC LEVEL SELECTED!");
                break;

            case "2":
                questions = intermediateQuestions;
                operators = intermediateOperators;
                System.out.println("\n🟡 INTERMEDIATE LEVEL SELECTED!");
                break;

            default:
                questions = highQuestions;
                operators = highOperators;
                System.out.println("\n🔴 HIGH LEVEL SELECTED!");
                break;
        }

        System.out.println("\n📝 Solve all calculations.");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Display calculations and collect answers
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("⚡ QUESTION " + (i + 1));
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println(
                questions[i][0] + " " +
                operators[i] + " " +
                questions[i][1] + " = ?"
            );

            System.out.print("\n👉 Your answer: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Quick Mathematics...");
                return;
            }

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

        // Display final score
        showResult();

        System.out.println("\n🌟 Practise mental mathematics to improve your speed!");
        System.out.println("🏆 Keep calculating and keep improving!");

    }
}
