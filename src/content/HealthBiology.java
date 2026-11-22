
package content;

import main.Navigation;
import java.util.Scanner;

public class HealthBiology {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "The Amazing Human Body",
            "Understanding DNA and Genetics",
            "How the Human Immune System Works",
            "The Invisible World",
            "The Science of Sleep and Human Health"
        };

        String[] articleFiles = {
            "The Amazing Human Body.txt",
            "Understanding DNA and Genetics.txt",
            "How the Human Immune System Works.txt",
            "The Invisible World.txt",
            "The Science of Sleep and Human Health.txt"
        };

        String[] externalResources = {
            "Human Body Anatomy - MedlinePlus",
            "DNA and Genetics - Genome.gov",
            "HHMI – Human Body Systems Videos",
            "Microbial Ecology and Antimicrobial Resistance - CDC",
            "Sleep and Human Health - NHLBI"
        };

        String[] resourceLinks = {
            "https://medlineplus.gov/anatomy.html",
            "https://www.genome.gov/genetics-glossary/Deoxyribonucleic-Acid-DNA",
            "https://www.biointeractive.org/planning-tools/resource-playlists/teaching-anatomy-and-physiology",
            "https://www.cdc.gov/antimicrobial-resistance/about/about-microbial-ecology.html",
            "https://www.nhlbi.nih.gov/health/sleep/why-sleep-important"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("             🧬 HEALTH & BIOLOGY");
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
                        "Health & Biology",
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
