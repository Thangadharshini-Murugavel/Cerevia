
package content;

import java.util.Scanner;

public class GeneralKnowledge {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n========== GENERAL KNOWLEDGE ==========");

            System.out.println("\nINTERNAL ARTICLES");

            System.out.println("1. World's Most Mysterious Places");

            System.out.println("2. Amazing Facts About Animals");

            System.out.println("3. Countries and Their Unique Cultures");

            System.out.println("4. Wonders of the Natural World");

            System.out.println("5. Extraordinary World Records");

            System.out.println("\nEXTERNAL RESOURCES");

            System.out.println("6. National Geographic Education");

            System.out.println("7. World Wildlife Fund - Wildlife");

            System.out.println("8. UNESCO World Heritage");

            System.out.println("9. Guinness World Records");

            System.out.println("10. Culturix - The World Explained");

            System.out.println("\n0. Back to Categories");

            System.out.println("=======================================");

            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    ArticleReader.mysteriousPlaces();
                    break;

                case 2:
                    ArticleReader.animalFacts();
                    break;

                case 3:
                    ArticleReader.worldCultures();
                    break;

                case 4:
                    ArticleReader.naturalWonders();
                    break;

                case 5:
                    ArticleReader.worldRecords();
                    break;

                case 6:
                    ExternalResource.open("National Geographic Education",
                            "https://education.nationalgeographic.org/");
                    break;

                case 7:
                    ExternalResource.open("World Wildlife Fund - Wildlife",
                            "https://www.worldwildlife.org/species/");
                    break;

                case 8:
                    ExternalResource.open("UNESCO World Heritage",
                            "https://whc.unesco.org/en/list/");
                    break;

                case 9:
                    ExternalResource.open("Guinness World Records",
                            "https://www.guinnessworldrecords.com/records");
                    break;

                case 10:
                    ExternalResource.open("Culturix - The World Explained",
                            "https://www.culturixcloud.com/world");
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
