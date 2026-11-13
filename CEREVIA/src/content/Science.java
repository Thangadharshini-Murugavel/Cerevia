package content;

import java.util.Scanner;

public class Science {

    public static void showMenu(Scanner s) {

        int choice;

        do {
            System.out.println("\n========== SCIENCE ==========");

            System.out.println("\nINTERNAL ARTICLES");
            System.out.println("1. The Mystery of Black Holes");
            System.out.println("2. How the Human Brain Works");
            System.out.println("3. The Science Behind Dreams");
            System.out.println("4. How Do Vaccines Work?");
            System.out.println("5. The Secrets of the Deep Ocean");

            System.out.println("\nEXTERNAL RESOURCES");
            System.out.println("6. Black Holes - NASA");
            System.out.println("7. James Webb Space Telescope - NASA");
            System.out.println("8. Human Body - Britannica");
            System.out.println("9. Science Videos - NASA");
            System.out.println("10. Science Learning - National Geographic");

            System.out.println("\n0. Back to Categories");
            System.out.println("=============================");

            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    ArticleReader.blackHoles();
                    break;

                case 2:
                    ArticleReader.brainWorks();
                    break;

                case 3:
                    ArticleReader.dreams();
                    break;

                case 4:
                    ArticleReader.vaccines();
                    break;

                case 5:
                    ArticleReader.deepOcean();
                    break;
                    
				case 6:
				    ExternalResource.open("Black Holes - NASA",
				            "https://science.nasa.gov/universe/black-holes/");
				    break;
				
				case 7:
				    ExternalResource.open("James Webb Space Telescope - NASA",
				            "https://science.nasa.gov/mission/webb/");
				    break;
				
				case 8:
				    ExternalResource.open("Human Body - Britannica",
				            "https://www.britannica.com/science/human-body");
				    break;
				
				case 9:
				    ExternalResource.open("Science Videos - NASA",
				            "https://www.nasa.gov/nasa-tv/");
				    break;
				
				case 10:
				    ExternalResource.open("Science Learning - National Geographic",
				            "https://education.nationalgeographic.org/");
				    break;


                case 0:
                    System.out.println("Returning to Categories...");
                    break;

                default:
                     System.out.println("Invalid choice! Try again.");
                    
            }

        } while (choice != 0);
    }
}
