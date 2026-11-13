
package focus;

import java.util.Scanner;

public class FocusCentre {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n");
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("             🎯 FOCUS TRAINING CENTRE");
            System.out.println("╚══════════════════════════════════════════════╝");

            System.out.println("\n       🧠 TRAIN YOUR MIND, IMPROVE YOUR FOCUS");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println("\n  1. 🧠 Memory Challenge");
            System.out.println("  2. 🔷 Pattern Recognition");
            System.out.println("  3. 👀 Attention Test");
            System.out.println("  4. 🧩 Logical Thinking");
            System.out.println("  5. ⚡ Quick Mathematics");
            System.out.println("  6. 🔢 Sequence Challenge");

            System.out.println("\n  0. ↩ Back to Main Menu");

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.print("👉 Enter your choice: ");

            choice = s.nextInt();
            s.nextLine();

            switch (choice) {

                case 1:
                	MemoryChallenge memory = new MemoryChallenge();
                    memory.start(s);
                    break;

                case 2:
                	PatternRecognition pattern = new PatternRecognition();
                    pattern.start(s);
                    break;
                    
                case 3:
                	AttentionTest attention = new AttentionTest();
                    attention.start(s);
                    break;

                case 4:
                	LogicalThinking logic = new LogicalThinking();
                    logic.start(s);
                    break;
                    
                    
                case 5:
                	QuickMathematics maths = new QuickMathematics();
                    maths.start(s);
                    break;

                case 6:
                	SequenceChallenge sequence = new SequenceChallenge();
                    sequence.start(s);
                    break;

                case 0:
                    System.out.println("\n👋 Returning to Main Menu...");
                    break;

                default:
                    System.out.println("\n❌ Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }
}
