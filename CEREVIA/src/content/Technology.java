
package content;

import java.util.Scanner;

public class Technology {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n========== 💻 TECHNOLOGY ==========");

            System.out.println("\n📚 INTERNAL ARTICLES");

            System.out.println("1. The Evolution of Artificial Intelligence");
            System.out.println("2. How the Internet Works");
            System.out.println("3. Understanding Cybersecurity");
            System.out.println("4. The World of Robotics");
            System.out.println("5. How Smartphones Changed the World");

            System.out.println("\n🌐 EXTERNAL RESOURCES");

            System.out.println("6. Artificial Intelligence - IBM");
            System.out.println("7. How the Internet Works - Cloudflare");
            System.out.println("8. Cybersecurity - CISA");
            System.out.println("9. Computer Science - Crash Course");
            System.out.println("10. Technology - MIT Technology Review");

            System.out.println("\n0. Back to Categories");
            System.out.println("===================================");

            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {

                case 1:
                    ArticleReader.artificialIntelligence();
                    break;

                case 2:
                    ArticleReader.internetWorks();
                    break;

                case 3:
                    ArticleReader.cybersecurity();
                    break;

                case 4:
                    ArticleReader.robotics();
                    break;

                case 5:
                    ArticleReader.smartphones();
                    break;

                case 6:
                    ExternalResource.open("Artificial Intelligence - IBM",
                            "https://www.ibm.com/think/topics/artificial-intelligence");
                    break;

                case 7:
                    ExternalResource.open("How the Internet Works - Cloudflare",
                            "https://www.cloudflare.com/learning/network-layer/how-does-the-internet-work/");
                    break;

                case 8:
                    ExternalResource.open("Cybersecurity - CISA",
                            "https://www.cisa.gov/topics/cybersecurity-best-practices");
                    break;

                case 9:
                    ExternalResource.open("Computer Science - Crash Course",
                            "https://www.youtube.com/@crashcourse");
                    break;

                case 10:
                    ExternalResource.open("Technology - MIT Technology Review",
                            "https://www.technologyreview.com/");
                    break;

                case 0:
                    System.out.println("Returning to Categories...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);
    }
}
