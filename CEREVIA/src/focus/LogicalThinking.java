
package focus;

import java.util.Scanner;

public class LogicalThinking extends FocusExercise {

    public LogicalThinking() {
        super("Logical Thinking");
    }

    @Override
    public void start(Scanner s) {

        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        String[][] questions = {
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

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("                 🧩 LOGICAL THINKING");
        System.out.println("╚══════════════════════════════════════════════╝");

        System.out.println("\n🎯 Think carefully before answering.");
        System.out.println("📝 Answer all five questions.");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i][0]);

            System.out.print("👉 Your answer: ");
            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase(questions[i][1])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Expected answer: " + questions[i][1]);
            }
        }

        showResult();

        System.out.println("\n🌟 Strong thinking comes from regular practice!");
    }
}
