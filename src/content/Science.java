
package content;

import main.Navigation;
import java.util.Scanner;

public class Science {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "The Mystery of Black Holes",
            "How the Human Brain Works",
            "The Science Behind Dreams",
            "How Do Vaccines Work?",
            "The Secrets of the Deep Ocean"
        };

        String[] articleFiles = {
            "Mystery of Black Holes.txt",
            "How Human Brain Works.txt",
            "Science Behind Dreams.txt",
            "How Do Vaccines Work.txt",
            "Secrets of Deep Ocean.txt"
        };

        String[] externalResources = {
            "Black Holes - NASA",
            "James Webb Space Telescope - NASA",
            "Human Body - Britannica",
            "NASA Live - Science and Space Videos",
            "Science Learning Resources - NASA"
        };

        String[] resourceLinks = {
            "https://science.nasa.gov/universe/black-holes/",
            "https://science.nasa.gov/mission/webb/",
            "https://www.britannica.com/science/human-body",
            "https://www.nasa.gov/live/",
            "https://www.nasa.gov/learning-resources/"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n========== 🔬 SCIENCE ==========");

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

            System.out.println("===============================");
            System.out.print("👉 Enter your choice: ");

            choice = s.nextLine().trim();

            switch (choice) {

                case "0":
                    System.out.println("↩️ Returning to Categories...");
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
                        "Science",
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
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        }
    }
}
