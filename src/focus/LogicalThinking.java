
package focus;

import java.util.Scanner;

public class LogicalThinking extends FocusExercise {

    public LogicalThinking() {
        super("Logical Thinking");
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
            "                  🧩 LOGICAL THINKING",
            "╚══════════════════════════════════════════════╝",
            "",
            "🎯 Think carefully before answering!",
            "🧠 Challenge your reasoning skills."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Questions",
            "2. 🟡 Intermediate - 5 Questions",
            "3. 🔴 High Level - 7 Questions",
            "E. 🚪 Exit Game"
        };

        // Format: Question, Answer
        String[][] basicQuestions = {
            {
                "A basket has 5 apples. You take 2. How many apples do you have?",
                "2"
            },
            {
                "What comes next: 2, 4, 6, 8, __?",
                "10"
            },
            {
                "If today is Monday, what day will it be after 2 days?",
                "WEDNESDAY"
            }
        };

        String[][] intermediateQuestions = {
            {
                "If all roses are flowers and some flowers fade quickly, must all roses fade quickly?",
                "NO"
            },
            {
                "A farmer has 10 sheep. All but 3 run away. How many remain?",
                "3"
            },
            {
                "What comes once in a minute, twice in a moment, but never in a thousand years?",
                "M"
            },
            {
                "If you overtake the person in second place in a race, what position are you in?",
                "SECOND"
            },
            {
                "Which is heavier: 1 kg of iron or 1 kg of cotton?",
                "SAME"
            }
        };

        String[][] highQuestions = {
            {
                "A clock takes 5 seconds to strike 6 times. How long will it take to strike 12 times?",
                "11"
            },
            {
                "Two fathers and two sons go fishing. Each catches one fish, but only 3 fish are caught. How is this possible?",
                "GRANDFATHER, FATHER AND SON"
            },
            {
                "A man looks at a photograph and says, 'Brothers and sisters I have none, but that man's father is my father's son.' Who is in the photograph?",
                "HIS SON"
            },
            {
                "If 5 machines make 5 products in 5 minutes, how long will 100 machines take to make 100 products?",
                "5"
            },
            {
                "A plane crashes on the border of two countries. Where should the survivors be buried?",
                "NOWHERE"
            },
            {
                "You have 3 switches outside a closed room. Only one controls a bulb inside. You can enter the room only once. How can you identify the correct switch?",
                "HEAT"
            },
            {
                "A doctor gives you 3 tablets and tells you to take one every 30 minutes. How long will the tablets last?",
                "60"
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
                System.out.println("\n🚪 Exiting Logical Thinking...");
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

        System.out.println("\n📝 Answer all questions carefully.");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Display questions and collect answers
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("🧩 QUESTION " + (i + 1));
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println(questions[i][0]);

            System.out.print("\n👉 Your answer: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Logical Thinking...");
                return;
            }

            String userAnswer = answer.toUpperCase();
            String expectedAnswer = questions[i][1];

            boolean isCorrect = userAnswer.equalsIgnoreCase(expectedAnswer);

            // Flexible validation for High Level Question 2
            if (choice.equals("3") && i == 1) {

                isCorrect = userAnswer.contains("GRANDFATHER")
                        && userAnswer.contains("FATHER")
                        && userAnswer.contains("SON");
            }

            if (isCorrect) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Expected answer: " + expectedAnswer);
            }
        }

        // Display final score
        showResult();

        System.out.println("\n🌟 Strong thinking comes from regular practice!");
        System.out.println("🏆 Keep challenging your mind!");
    }
}
