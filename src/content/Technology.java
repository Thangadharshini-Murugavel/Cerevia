
package content;

import main.Navigation;
import java.util.Scanner;

public class Technology {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "The Evolution of Artificial Intelligence",
            "How the Internet Works",
            "Understanding Cybersecurity",
            "The World of Robotics",
            "How Smartphones Changed the World"
        };

        String[] articleFiles = {
            "Artificial Intelligence.txt",
            "How Internet Works.txt",
            "Cybersecurity.txt",
            "Robotics and Automation.txt",
            "Evolution of Smartphones.txt"
        };

        String[] externalResources = {
            "Artificial Intelligence - IBM",
            "How the Internet Works - Cloudflare",
            "Cybersecurity - CISA",
            "Computer Science - Crash Course",
            "Technology - MIT Technology Review"
        };

        String[] resourceLinks = {
            "https://www.ibm.com/think/topics/artificial-intelligence",
            "https://www.cloudflare.com/learning/network-layer/how-does-the-internet-work/",
            "https://www.cisa.gov/topics/cybersecurity-best-practices",
            "https://www.pbs.org/show/crash-course-computer-science/",
            "https://www.technologyreview.com/"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n========== 💻 TECHNOLOGY ==========");

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

            System.out.println("===================================");
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
                        "Technology",
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
