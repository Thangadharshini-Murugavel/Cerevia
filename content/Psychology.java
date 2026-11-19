
package content;

import main.Navigation;
import java.util.Scanner;

public class Psychology {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "How Human Memory Works",
            "Understanding Emotions",
            "Why Do We Develop Habits?",
            "The Psychology of Decision Making",
            "How Attention and Focus Work"
        };

        String[] articleFiles = {
            "Understanding Human Memory.txt",
            "Understanding Human Emotions.txt",
            "The Psychology of Habits.txt",
            "Psychology of Decision Making.txt",
            "Attention and Focus.txt"
        };

        String[] externalResources = {
            "Psychology - Simply Psychology",
            "Memory - Britannica",
            "Brain and Behaviour - APA",
            "Psychology Videos - Crash Course",
            "Psychology - Psychology Today"
        };

        String[] resourceLinks = {
            "https://www.simplypsychology.org/",
            "https://www.britannica.com/science/memory-psychology",
            "https://www.apa.org/topics/",
            "https://thecrashcourse.com/courses/psychology/",
            "https://www.psychologytoday.com/"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("              🧠 PSYCHOLOGY");
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
                        "Psychology",
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
