
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

        String[] banner = {
            "",
            "╔══════════════════════════════════════════════╗",
            "                🧠 MEMORY CHALLENGE",
            "╚══════════════════════════════════════════════╝",
            "",
            "🎯 Test your memory and concentration!",
            "💡 Memorise the words and recall them in order."
        };

        String[] levels = {
            "1. 🟢 Basic - 3 Words",
            "2. 🟡 Intermediate - 5 Words",
            "3. 🔴 High Level - 7 Words",
            "E. 🚪 Exit Game"
        };

        String[] basicWords = {
            "APPLE", "RIVER", "PLANET"
        };

        String[] intermediateWords = {
            "APPLE", "RIVER", "PLANET",
            "GUITAR", "FLOWER"
        };

        String[] highWords = {
            "APPLE", "RIVER", "PLANET",
            "GUITAR", "FLOWER", "MOUNTAIN", "DIAMOND"
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
                System.out.println("\n🚪 Exiting Memory Challenge...");
                return;
            }

            if (choice.equals("1") || choice.equals("2")
                    || choice.equals("3")) {
                break;
            }

            System.out.println("❌ Invalid choice! Select 1, 2, 3 or E.");
        }

        String[] words;

        switch (choice) {

            case "1":
                words = basicWords;
                System.out.println("\n🟢 BASIC LEVEL SELECTED!");
                break;

            case "2":
                words = intermediateWords;
                System.out.println("\n🟡 INTERMEDIATE LEVEL SELECTED!");
                break;

            default:
                words = highWords;
                System.out.println("\n🔴 HIGH LEVEL SELECTED!");
                break;
        }

        System.out.println("\n⏳ Memorise the following words!");

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        for (int i = 0; i < words.length; i++) {
            System.out.println("       " + (i + 1) + ". " + words[i]);
        }

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("\n💡 Press ENTER when you are ready.");
        System.out.println("🚪 Press E to exit the game.");

        String ready = s.nextLine().trim();

        if (ready.equalsIgnoreCase("E")) {
            System.out.println("\n🚪 Exiting Memory Challenge...");
            return;
        }

        // Hide the displayed words
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        String[] recallBanner = {
            "╔══════════════════════════════════════════════╗",
            "                 ✍️ RECALL THE WORDS",
            "╚══════════════════════════════════════════════╝"
        };

        for (String line : recallBanner) {
            System.out.println(line);
        }

        System.out.println("\n🧠 Enter the words in the correct order.");
        System.out.println("🚪 Type E at any time to exit the game.");

        // Collect user's answers
        for (int i = 0; i < words.length; i++) {

            System.out.print("\n" + (i + 1) + ". ✍️ Enter word: ");

            String answer = s.nextLine().trim();

            if (answer.equalsIgnoreCase("E")) {
                System.out.println("\n🚪 Exiting Memory Challenge...");
                return;
            }

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
        System.out.println("🏆 Great effort! Keep challenging yourself!");

    }
}
