
package content;

import main.Navigation;
import java.util.Scanner;

public class EnvironmentClimate {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "Understanding Climate Change",
            "Importance of Forests",
            "Water Conservation",
            "Renewable Energy Sources",
            "Plastic Pollution and Its Impact"
        };

        String[] articleFiles = {
            "Understanding Climate Change.txt",
            "Importance of Forests.txt",
            "Water Conservation.txt",
            "Renewable Energy Sources.txt",
            "Plastic Pollution and Its Impact.txt"
        };

        String[] externalResources = {
            "Climate Change - United Nations",
            "Why Do Forests Matter? - UNEP",
            "TED-Ed – Our Changing Climate videos",
            "Renewable Energy Explained - EIA",
            "Plastic Pollution - UNEP"
        };

        String[] resourceLinks = {
            "https://www.un.org/en/global-issues/climate-change",
            "https://www.unep.org/en/what-we-do/forests/why-do-forests-matter",
            "https://ed.ted.com/ted_ed_collections/our-changing-climate",
            "https://www.eia.gov/energyexplained/renewable-sources/",
            "https://www.unep.org/en/what-we-do/chemicals-and-pollution-action/plastic-pollution"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("          🌱 ENVIRONMENT & CLIMATE");
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
                        "Environment & Climate",
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
