
package focus;

import java.util.Scanner;

public class MemoryChallenge extends FocusExercise {

    public MemoryChallenge() {
        super("Memory Challenge");
    }

    @Override
    public void start(Scanner s) {

        // Reset previous scores
        score = 0;
        correctAnswers = 0;
        incorrectAnswers = 0;

        String[] words = {
            "APPLE",
            "RIVER",
            "PLANET",
            "GUITAR",
            "FLOWER"
        };

        System.out.println("\n");
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("               🧠 MEMORY CHALLENGE");
        System.out.println("╚══════════════════════════════════════════════╝");

        System.out.println("\n🎯 Memorise the following five words!");
        System.out.println("⏳ You will have time to remember them.");

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        for (int i = 0; i < words.length; i++) {
            System.out.println("       " + (i + 1) + ". " + words[i]);
        }

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Consume leftover newline from menu input
        s.nextLine();

        System.out.print("\n👉 Press ENTER when you are ready: ");
        s.nextLine();

        // Hide the displayed words
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("             ✍️ RECALL THE WORDS");
        System.out.println("╚══════════════════════════════════════════════╝");

        System.out.println("\n🧠 Enter the five words in the correct order.");

        // Collect user's answers
        for (int i = 0; i < words.length; i++) {

            System.out.print("\n" + (i + 1) + ". Enter word: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase(words[i])) {
                checkAnswer(true);
            } else {
                checkAnswer(false);
                System.out.println("💡 Correct word: " + words[i]);
            }
        }

        // Display final score
        showResult();

        System.out.println("\n🌟 Keep practising to improve your memory!");
    }
}
