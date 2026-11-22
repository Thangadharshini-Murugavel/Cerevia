
package focus;

import java.util.Scanner;

public class PatternRecognition extends FocusExercise {

    public PatternRecognition() {
        super("Pattern Recognition");
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
            "              🔷 PATTERN RECOGNITION",
            "╚══════════════════════════════════════════════╝",
            "",
            "🧠 Identify the rule behind each pattern!",
            "🎯 Find what comes next in the sequence."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Questions",
            "2. 🟡 Intermediate - 5 Questions",
            "3. 🔴 High Level - 7 Questions",
            "E. 🚪 Exit Game"
        };

        String[][] basicQuestions = {
            {"2, 4, 6, 8, ?", "10"},
            {"A, B, C, D, ?", "E"},
            {"5, 10, 15, 20, ?", "25"}
        };

        String[][] intermediateQuestions = {
            {"A, C, E, G, ?", "I"},
            {"AB, CD, EF, GH, ?", "IJ"},
            {"MONDAY, WEDNESDAY, FRIDAY, ?", "SUNDAY"},
            {"2, 6, 12, 20, ?", "30"},
            {"CAT, DOG, CAT, DOG, ?", "CAT"}
        };

        String[][] highQuestions = {
            {"AZ, BY, CX, ?", "DW"},
            {"1, 4, 9, 16, 25, ?", "36"},
            {"3, 6, 12, 24, ?", "48"},
            {"2, 3, 5, 8, 13, ?", "21"},
            {"Z, X, V, T, ?", "R"},
            {"1, 1, 2, 3, 5, 8, ?", "13"},
            {"1, 8, 27, 64, ?", "125"}
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
                System.out.println("\n🚪 Exiting Pattern Recognition...");
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

        System.out.println("\n🎯 Answer all the questions.");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Display questions and collect answers
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n------------------------------------------------");
            System.out.println("📝 Question " + (i + 1) + ":");
            System.out.println("🔍 " + questions[i][0]);

            System.out.print("👉 Your answer: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Pattern Recognition...");
                return;
            }

            if (answer.equalsIgnoreCase(questions[i][1])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Correct answer: " + questions[i][1]);
            }
        }

        // Display final score
        showResult();

        System.out.println("\n🌟 Keep practising your pattern recognition skills!");
        System.out.println("🏆 Every pattern solved makes your thinking sharper!");

    }
}
