package content;

import java.util.Scanner;

public class ContentHub {
	public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n============================================================================");
            System.out.println("                       LONG-FORM CONTENT HUB");
            System.out.println("============================================================================");

            System.out.println("\n                       SELECT A CATEGORY\n");

            System.out.println("                  1. Science");
            System.out.println("                  2. Technology");
            System.out.println("                  3. Psychology");
            System.out.println("                  4. History");
            System.out.println("                  5. General Knowledge");
            System.out.println("                  6. Back to Main Menu");

            System.out.println("\n============================================================================");
            System.out.print("                  Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {
	            case 1:
	                Science.showMenu(s);
	                break;
         
                case 2:
                    Technology.showMenu(s);
                    break;

                case 3:
                    Psychology.showMenu(s);
                    break;

                case 4:
                    History.showMenu(s);
                    break;

                case 5:
                    GeneralKnowledge.showMenu(s);
                    break;

                case 6:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");

            }

        } while (choice != 6);
        
        
	}
	
}
