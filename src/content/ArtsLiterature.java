
package content;

import main.Navigation;
import java.util.Scanner;

public class ArtsLiterature {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "The Art of Storytelling",
            "World Literature and Its Influence",
            "History and Evolution of Art",
            "How Music Connects with Emotions",
            "Evolution of Theatre and Cinema"
        };

        String[] articleFiles = {
            "Storytelling.txt",
            "WorldLiterature.txt",
            "HistoryOfArt.txt",
            "MusicAndEmotions.txt",
            "TheatreAndCinema.txt"
        };

        String[] externalResources = {
            "Oral Traditions and Storytelling - UNESCO",
            "Shakespeare's Works - Folger Library",
            "TED – Creativity and Storytelling-Videos",
            "Music and Emotions - APA",
            "Theatre and Performing Arts - UNESCO"
        };

        String[] resourceLinks = {
            "https://ich.unesco.org/en/oral-traditions-00053",
            "https://www.folger.edu/explore/shakespeares-works/",
            "https://www.ted.com/playlists/756/ted_talks_on_creativity_and_storytelling",
            "https://www.apa.org/news/podcasts/speaking-of-psychology/music",
            "https://ich.unesco.org/en/performing-arts-00054"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("             🎨 ARTS & LITERATURE");
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
                        "Arts & Literature",
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
