
package main;

import java.util.Scanner;
import content.ContentHub;
import focus.FocusCentre;
import progress.ProgressCentre;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] menu = {
            "📚 Long-Form Content Hub",
            "🧠 Focus Training Centre",
            "📊 Progress Centre",
            "🚪 Exit"
        };

        String choice = "";

        String[] banner = {
            "",
            "============================================================================",
            "                         🧠 WELCOME TO CEREVIA",
            "                    ✨ Less Short-Form. More Long-Form.",
            "============================================================================"
        };

        for (String line : banner) {
            System.out.println(line);
        }

        while (!choice.equals("4") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n                         🌟 MAIN MENU\n");

            for (int i = 0; i < menu.length; i++) {
                System.out.println("                  " + (i + 1) + ". " + menu[i]);
            }

            System.out.println("\n============================================================================");
            System.out.print("                  👉 Enter your choice: ");

            choice = s.nextLine().trim();

            switch (choice) {

                case "1":
                    ContentHub.showMenu(s);
                    break;

                case "2":
                    FocusCentre.showMenu(s);
                    break;

                case "3":
                    ProgressCentre.showMenu(s);
                    break;

                case "4":
                case "00":
                    break;

                default:
                    System.out.println("\n❌ Invalid choice! Please try again.");
            }
        }

        System.out.println("\n👋 Thank you for using CEREVIA!");
        System.out.println("🌱 Keep learning. Keep growing. Stay focused!");

        s.close();
    }
}
