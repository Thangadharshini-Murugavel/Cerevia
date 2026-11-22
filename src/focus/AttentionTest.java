
package focus;

import java.util.Scanner;

public class AttentionTest extends FocusExercise {

    public AttentionTest() {
        super("Attention Test");
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
            "          👀 ATTENTION AND CONCENTRATION",
            "╚══════════════════════════════════════════════╝",
            "",
            "🎯 Focus carefully and observe every detail!",
            "🧠 Train your attention and concentration."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Questions",
            "2. 🟡 Intermediate - 5 Questions",
            "3. 🔴 High Level - 7 Questions",
            "E. 🚪 Exit Game"
        };

        // Format: Question title, question, answer

        String[][] basicQuestions = {
            {
                "TARGET DETECTION",
                "How many times does A appear?\nB A C A D E A F G",
                "3"
            },
            {
                "NUMBER COUNTING",
                "Count the number of 5s:\n5 2 5 8 1 5 4 5",
                "4"
            },
            {
                "WORD OBSERVATION",
                "Which word is repeated?\nPEN BOOK BAG PEN BOX",
                "PEN"
            }
        };

        String[][] intermediateQuestions = {
            {
                "TARGET DETECTION",
                "How many times does A appear?\nB A C A D E A F G A H",
                "4"
            },
            {
                "SELECTIVE ATTENTION",
                "Count the number of 7s:\n7 1 7 3 9 7 2 5 7 8 6 7",
                "5"
            },
            {
                "ERROR DETECTION",
                "Which word is repeated?\nBOOK PEN TABLE CHAIR PEN CLOCK",
                "PEN"
            },
            {
                "CONCENTRATION",
                "How many times does 3 appear?\n3 8 1 3 5 3 9 2 3 7 4 3",
                "5"
            },
            {
                "DISTRACTION TEST",
                "Find the number that breaks the even-number pattern:\n2 4 6 8 11 12 14",
                "11"
            }
        };

        String[][] highQuestions = {
            {
                "ADVANCED COUNTING",
                "How many times does the letter M appear?\nM N M P Q M R S M T M",
                "5"
            },
            {
                "NUMBER DETECTION",
                "Count the number of 9s:\n9 3 6 9 1 9 4 7 9 2 9 5 9",
                "6"
            },
            {
                "WORD RECOGNITION",
                "Which word appears exactly three times?\nSUN MOON STAR SUN PLANET MOON SUN",
                "SUN"
            },
            {
                "PATTERN OBSERVATION",
                "Find the number that breaks the pattern:\n3 6 9 12 16 18 21",
                "16"
            },
            {
                "SYMBOL DETECTION",
                "How many @ symbols appear?\n# @ $ @ % & @ * @ # $",
                "4"
            },
            {
                "LETTER OBSERVATION",
                "Which letter appears most often?\nA B C A D B A C A",
                "A"
            },
            {
                "SEQUENCE ATTENTION",
                "How many numbers are greater than 5?\n2 8 4 9 1 7 3 6 5 10",
                "5"
            }
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
                System.out.println("\n🚪 Exiting Attention Test...");
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

        System.out.println("\n🎯 Answer all the questions carefully!");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Display questions and collect answers
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("📝 QUESTION " + (i + 1) + " - " + questions[i][0]);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println(questions[i][1]);

            System.out.print("\n👉 Your answer: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Attention Test...");
                return;
            }

            if (answer.equalsIgnoreCase(questions[i][2])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Correct answer: " + questions[i][2]);
            }
        }

        // Display final score
        showResult();

        System.out.println("\n🌟 Keep practising to strengthen your concentration!");
        System.out.println("🏆 Stay alert, stay focused!");

    }
}
