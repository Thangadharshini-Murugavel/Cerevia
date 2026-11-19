
package content;

import main.Navigation;
import java.util.Scanner;

public class SpaceAstronomy {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "The Wonders of the Universe",
            "Understanding Black Holes",
            "The Solar System and Its Planets",
            "The Search for Life Beyond Earth",
            "From Rockets to Space Stations"
        };

        String[] articleFiles = {
            "The Wonders of the Universe.txt",
            "Understanding Black Holes.txt",
            "The Solar System and Its Planets.txt",
            "The Search for Life Beyond Earth.txt",
            "From Rockets to Space Stations.txt"
        };

        String[] externalResources = {
            "Explore the Universe - NASA",
            "Black Holes - NASA",
            "TED-Ed – Out of This World- videos",
            "Search for Life Beyond Earth - NASA",
            "International Space Station - NASA"
        };

        String[] resourceLinks = {
            "https://science.nasa.gov/universe/",
            "https://science.nasa.gov/universe/black-holes/",
            "https://ed.ted.com/ted_ed_collections/out-of-this-world",
            "https://science.nasa.gov/exoplanets/search-for-life/",
            "https://www.nasa.gov/international-space-station/"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("             🌌 SPACE & ASTRONOMY");
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
                        "Space & Astronomy",
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
