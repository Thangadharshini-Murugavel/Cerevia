
package progress;

import java.util.Scanner;
import main.Navigation;

public class ProgressCentre {

    public static void showMenu(Scanner s) {

        String choice;

        String[] banner = {
            "",
            "╔══════════════════════════════════════════════╗",
            "                  📊 PROGRESS CENTRE",
            "╚══════════════════════════════════════════════╝",
            "",
            "🌟 Track your learning and performance!"
        };

        String[] options = {
            "1. 📈 View Overall Progress",
            "0. ↩️ Return to Main Menu",
            "00. 🚪 Exit CEREVIA"
        };

        do {

            for (String line : banner) {
                System.out.println(line);
            }

            for (String option : options) {
                System.out.println(option);
            }

            System.out.println("\n================================================");
            System.out.print("👉 Enter your choice: ");

            choice = s.nextLine().trim();

            switch (choice) {

                case "1":
                    ProgressTracker.showProgress();
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
