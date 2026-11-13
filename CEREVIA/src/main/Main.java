package main;


import java.util.Scanner;
import content.ContentHub;
import focus.FocusCentre;
import progress.ProgressCentre;
public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("============================================================================");
	System.out.println("                        Welcome to Cerevia 🧠");
	System.out.println("                  Less Short-Form. More Long-Form.");
	System.out.println("============================================================================");
	int choice;
	do {
		System.out.println("\n                         MAIN MENU");
        System.out.println();
        System.out.println("                  1. Long-Form Content Hub");
        System.out.println("                  2. Focus Training Centre");
        System.out.println("                  3. Progress Centre");
        System.out.println("                  4. Exit");

        System.out.println("\n============================================================================");
        System.out.print("                  Enter your choice: ");
        choice = s.nextInt();
        
        switch (choice) {

        case 1:
        	System.out.println("\nOpening Long-Form Content Hub...2");
        	ContentHub.showMenu(s);
            break;

        case 2:
        	System.out.println("\nOpening Focus Training Centre...");
            FocusCentre.showMenu(s);
            break;
            

        case 3:
            System.out.println("Opening Progress Centre...");
            ProgressCentre.showMenu(s);
            break;

        case 4:
            System.out.println("Thank you for using Cerevia!");
            break;

        default:
            System.out.println("Invalid choice! Please try again.");

    }    
	}while (choice != 4);

    s.close();
}
}
