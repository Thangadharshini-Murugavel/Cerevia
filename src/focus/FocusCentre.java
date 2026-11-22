
package focus;

import java.util.Scanner;
import main.Navigation;

public class FocusCentre {

    public static void showMenu(Scanner s) {

        String choice;

        String[] banner = {
            "",
            "╔══════════════════════════════════════════════╗",
            "             🎯 FOCUS TRAINING CENTRE 🧠",
            "╚══════════════════════════════════════════════╝",
            "",
            "       🚀 TRAIN YOUR MIND, IMPROVE YOUR FOCUS",
            "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
        };

        String[] options = {
            "  1. 🧠 Memory Challenge",
            "  2. 🔷 Pattern Recognition",
            "  3. 👀 Attention Test",
            "  4. 🧩 Logical Thinking",
            "  5. ⚡ Quick Mathematics",
            "  6. 🔢 Sequence Challenge",
            "",
            "  0. ↩️ Back to Main Menu",
            "  00. 🚪 Exit CEREVIA"
        };

        do {

            for (String line : banner) {
                System.out.println(line);
            }

            for (String option : options) {
                System.out.println(option);
            }

            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("👉 Enter your choice: ");

            choice = s.nextLine().trim();

            switch (choice) {

                case "1":
                    MemoryChallenge memory = new MemoryChallenge();
                    memory.start(s);
                    break;

                case "2":
                    PatternRecognition pattern = new PatternRecognition();
                    pattern.start(s);
                    break;

                case "3":
                    AttentionTest attention = new AttentionTest();
                    attention.start(s);
                    break;

                case "4":
                    LogicalThinking logic = new LogicalThinking();
                    logic.start(s);
                    break;

                case "5":
                    QuickMathematics maths = new QuickMathematics();
                    maths.start(s);
                    break;

                case "6":
                    SequenceChallenge sequence = new SequenceChallenge();
                    sequence.start(s);
                    break;

                case "0":
                    System.out.println("\n↩️ Returning to Main Menu...");
                    break;

                case "00":
                    System.out.println("\n👋 Exiting CEREVIA...");
                    Navigation.exitApplication();
                    break;

                default:
                    System.out.println("\n❌ Invalid choice! Please try again.");
            }

        } while (!choice.equals("0") && !Navigation.exitRequested);

    }
}
