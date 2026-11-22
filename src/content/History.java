
package content;

import main.Navigation;
import java.util.Scanner;

public class History {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "Rise and Fall of the Roman Empire",
            "Secrets of Ancient Egypt",
            "Story of World War II",
            "History of Ancient India",
            "World's Greatest Historical Inventions"
        };

        String[] articleFiles = {
            "Roman Empire.txt",
            "Ancient Egypt.txt",
            "World War II.txt",
            "Ancient India.txt",
            "Historical Inventions.txt"
        };

        String[] externalResources = {
            "Ancient History Collection - HISTORY",
            "Ancient Rome - National Geographic",
            "World History - Khan Academy",
            "Past to Present - ABC Education",
            "History Videos - HISTORY"
        };

        String[] resourceLinks = {
            "https://www.history.com/topics/ancient-history",
            "https://www.nationalgeographic.com/history/article/ancient-roman-empire-bridges-buildings",
            "https://www.khanacademy.org/humanities/world-history",
            "https://www.abc.net.au/education/collections/past-to-present/106625528",
            "https://www.history.com/videos"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("                  📜 HISTORY");
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
                        "History",
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
