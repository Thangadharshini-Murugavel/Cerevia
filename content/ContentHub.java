
package content;

import java.util.Scanner;
import main.Navigation;

public class ContentHub {

    public static void showMenu(Scanner s) {

        String[] categories = {
            "Science",
            "Technology",
            "Psychology",
            "History",
            "General Knowledge",
            "Environment & Climate",
            "Health & Biology",
            "Space & Astronomy",
            "Business & Economics",
            "Arts & Literature",
            "Back to Main Menu"
        };

        int choice = -1;

        while (!Navigation.exitRequested) { 

            System.out.println("\n==================================================");
            System.out.println("              LONG-FORM CONTENT HUB");
            System.out.println("==================================================");
            System.out.println("\n              SELECT A CATEGORY\n");

            for (int i = 0; i < categories.length; i++) {
                System.out.println("              " + (i + 1) + ". " + categories[i]);
            }

            System.out.println("\n              0. Back to Main Menu");
            System.out.println("              00. Exit CEREVIA");

            System.out.print("\n              Enter your choice: ");

            String input = s.next().trim();

            if (input.equals("00")) {
                Navigation.exitApplication();
                break;
            }

            if (input.equals("0")) {
                break;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid number!");
                continue;
            }

            switch (choice) {

                case 1: Science.showMenu(s); break;
                case 2: Technology.showMenu(s); break;
                case 3: Psychology.showMenu(s); break;
                case 4: History.showMenu(s); break;
                case 5: GeneralKnowledge.showMenu(s); break;
                case 6: EnvironmentClimate.showMenu(s); break;
                case 7: HealthBiology.showMenu(s); break;
                case 8: SpaceAstronomy.showMenu(s); break;
                case 9: BusinessEconomics.showMenu(s); break;
                case 10: ArtsLiterature.showMenu(s); break;
                case 11: break;

                default:
                    System.out.println("\nInvalid choice! Try again.");
            }
        }
    }
}
