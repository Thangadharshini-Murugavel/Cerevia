
package content;

import main.Navigation;
import java.util.Scanner;

public class GeneralKnowledge {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "World's Most Mysterious Places",
            "Amazing Facts About Animals",
            "Countries and Their Unique Cultures",
            "Wonders of the Natural World",
            "Incredible World Records"
        };

        String[] articleFiles = {
            "Mysterious Places.txt",
            "Amazing Animal Facts.txt",
            "World Cultures and Traditions.txt",
            "Natural Wonders.txt",
            "Incredible World Records.txt"
        };

        String[] externalResources = {
            "National Geographic Education",
            "World Wildlife Fund - Wildlife",
            "UNESCO World Heritage",
            "Guinness World Records",
            "Culturix - The World Explained"
        };

        String[] resourceLinks = {
            "https://education.nationalgeographic.org/",
            "https://www.worldwildlife.org/species/",
            "https://whc.unesco.org/en/list/",
            "https://www.guinnessworldrecords.com/records",
            "https://www.culturixcloud.com/world"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("             🌍 GENERAL KNOWLEDGE");
            System.out.println("===========================================");

            System.out.println("\n📚 INTERNAL ARTICLES");

            for (int i = 0; i < internalArticles.length; i++) {
                System.out.println((i + 1) + ". " + internalArticles[i]);
            }

            System.out.println("\n🌐 EXTERNAL RESOURCES");

            for (int i = 0; i < externalResources.length; i++) {
                System.out.println((i + 6) + ". " + externalResources[i]);
            }

            String[] options = {
                "0. ↩️ Back to Categories",
                "00. 🚪 Exit CEREVIA"
            };

            for (String option : options) {
                System.out.println(option);
            }

            System.out.println("===========================================");
            System.out.print("👉 Enter your choice: ");

            choice = s.nextLine().trim();

            switch (choice) {

                case "0":
                    System.out.println("\n↩️ Returning to Categories...");
                    break;

                case "00":
                    Navigation.exitApplication();
                    break;

                case "1":
                case "2":
                case "3":
                case "4":
                case "5":

                    int articleChoice = Integer.parseInt(choice);

                    ArticleFileReader.showArticle(
                        s,
                        "General Knowledge",
                        articleFiles[articleChoice - 1]
                    );
                    break;

                case "6":
                case "7":
                case "8":
                case "9":
                case "10":

                    int resourceChoice = Integer.parseInt(choice);

                    ExternalResource.open(
                        externalResources[resourceChoice - 6],
                        resourceLinks[resourceChoice - 6]
                    );
                    break;

                default:
                    System.out.println("\n❌ Invalid choice! Try again.");
            }
        }
    }
}
