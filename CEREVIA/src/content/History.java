
package content;

import java.util.Scanner;

public class History {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n========== HISTORY ==========");

            System.out.println("\nINTERNAL ARTICLES");

            System.out.println("1. Rise and Fall of the Roman Empire");

            System.out.println("2. Secrets of Ancient Egypt");

            System.out.println("3. Story of World War II");

            System.out.println("4. History of Ancient India");

            System.out.println("5. World's Greatest Historical Inventions");

            System.out.println("\nEXTERNAL RESOURCES");

            System.out.println("6. Ancient History Collection - HISTORY");

            System.out.println("7. Ancient Rome - National Geographic");

            System.out.println("8. World History - Khan Academy");

            System.out.println("9. Past to Present - ABC Education");

            System.out.println("10. History Videos - HISTORY");

            System.out.println("\n0. Back to Categories");

            System.out.println("=============================");

            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    ArticleReader.romanEmpire();
                    break;

                case 2:
                    ArticleReader.ancientEgypt();
                    break;

                case 3:
                    ArticleReader.worldWarII();
                    break;

                case 4:
                    ArticleReader.ancientIndia();
                    break;

                case 5:
                    ArticleReader.historicalInventions();
                    break;

                case 6:
                    ExternalResource.open("Ancient History Collection - HISTORY",
                            "https://www.history.com/collections/ancient-history");
                    break;

                case 7:
                    ExternalResource.open("Ancient Rome - National Geographic",
                            "https://kids.nationalgeographic.com/history/article/ancient-rome");
                    break;

                case 8:
                    ExternalResource.open("World History - Khan Academy",
                            "https://www.khanacademy.org/humanities/history");
                    break;

                case 9:
                    ExternalResource.open("Past to Present - ABC Education",
                            "https://www.abc.net.au/education/collections/past-to-present/106625528");
                    break;

                case 10:
                    ExternalResource.open("History Videos - HISTORY",
                            "https://www.history.com/videos");
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
