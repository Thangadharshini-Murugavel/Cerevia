
package focus;

import java.util.Scanner;

public class SequenceChallenge extends FocusExercise {

    public SequenceChallenge() {
        super("Sequence Challenge");
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
            "                🔢 SEQUENCE CHALLENGE",
            "╚══════════════════════════════════════════════╝",
            "",
            "🎯 Identify the rule behind each sequence!",
            "🧠 Find the missing number and sharpen your thinking."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Questions",
            "2. 🟡 Intermediate - 5 Questions",
            "3. 🔴 High Level - 7 Questions",
            "E. 🚪 Exit Game"
        };

        // Format: Sequence, Answer

        String[][] basicQuestions = {
            {"1, 2, 3, 4, ?", "5"},
            {"5, 10, 15, 20, ?", "25"},
            {"2, 4, 6, 8, ?", "10"}
        };

        String[][] intermediateQuestions = {
        	{"3, 7, 11, 15, ?", "19"},
            {"2, 4, 8, 16, ?", "32"},
            {"10, 20, 30, 40, ?", "50"},
            {"1, 1, 2, 3, 5, ?", "8"},
            {"81, 27, 9, 3, ?", "1"}
        };

        String[][] highQuestions = {
            {"3, 6, 12, 24, ?", "48"},
            {"1, 4, 9, 16, 25, ?", "36"},
            {"2, 6, 12, 20, 30, ?", "42"},
            {"100, 90, 81, 73, 66, ?", "60"},
            {"1, 2, 6, 24, 120, ?", "720"},
            {"2, 3, 5, 8, 13, 21, ?", "34"},
            {"1, 8, 27, 64, 125, ?", "216"}
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
                System.out.println("\n🚪 Exiting Sequence Challenge...");
                return;
            }

            if (choice.equals("1") || choice.equals("2")
                    || choice.equals("3")) {
                break;
            }

            System.out.println("❌ Invalid choice! Select 1, 2, 3 or E.");
        }

        String[][] questions;

        switch (choice) {

            case "1":
                questions = basicQuestions;
                System.out.println("\n🟢 BASIC LEVEL SELECTED!");
                break;

            case "2":
                questions = intermediateQuestions;
                System.out.println("\n🟡 INTERMEDIATE LEVEL SELECTED!");
                break;

            default:
                questions = highQuestions;
                System.out.println("\n🔴 HIGH LEVEL SELECTED!");
                break;
        }

        System.out.println("\n📝 Find the missing number in each sequence.");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Display sequences and collect answers
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("🔢 QUESTION " + (i + 1));
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println(questions[i][0]);

            System.out.print("\n👉 Your answer: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Sequence Challenge...");
                return;
            }

            if (answer.equals(questions[i][1])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Correct answer: " + questions[i][1]);
            }
        }

        // Display final score
        showResult();

        System.out.println("\n🌟 Keep challenging your brain!");
        System.out.println("🏆 Every sequence solved strengthens your thinking!");

    }
}
