
package content;

import main.Navigation;
import java.util.Scanner;

public class BusinessEconomics {

    public static void showMenu(Scanner s) {

        String[] internalArticles = {
            "Understanding Business and Entrepreneurship",
            "Money and Banking",
            "Supply and Demand",
            "Understanding Stock Markets",
            "Inflation and GDP"
        };

        String[] articleFiles = {
            "Understanding Business and Entrepreneurship.txt",
            "MoneyBanking.txt",
            "SupplyDemand.txt",
            "StockMarkets.txt",
            "InflationGDPEconomy.txt"
        };

        String[] externalResources = {
            "Entrepreneurship - Investopedia",
            "Money and Banking - Federal Reserve",
            "Federal Reserve – Economic Lowdown Videos",
            "Introduction to Investing - Investor.gov",
            "Inflation - IMF"
        };

        String[] resourceLinks = {
            "https://www.investopedia.com/terms/e/entrepreneur.asp",
            "https://www.federalreserve.gov/aboutthefed.htm",
            "https://www.federalreserveeducation.org/teaching-resources/economics/series/economic-lowdown-video-series",
            "https://www.investor.gov/introduction-investing",
            "https://www.imf.org/en/blogs/topics/inflation"
        };

        String choice = "";

        while (!choice.equals("0") &&
               !choice.equals("00") &&
               !Navigation.exitRequested) {

            System.out.println("\n===========================================");
            System.out.println("           📈 BUSINESS & ECONOMICS");
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
                        "Business & Economics",
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
