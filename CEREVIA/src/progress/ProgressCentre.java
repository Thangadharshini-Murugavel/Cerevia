
package progress;

import java.util.Scanner;

public class ProgressCentre {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n");
            System.out.println("================================================");
            System.out.println("                 PROGRESS CENTRE");
            System.out.println("================================================");

            System.out.println("\n1. View Overall Progress");
            System.out.println("2. Return to Main Menu");

            System.out.println("\n================================================");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    ProgressTracker.showProgress();
                    break;

                case 2:
                    System.out.println("\nReturning to Main Menu...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 2);
    }
}
