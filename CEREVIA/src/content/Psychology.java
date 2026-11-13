
package content;

import java.util.Scanner;

public class Psychology {

    public static void showMenu(Scanner s) {

        int choice;

        do {

            System.out.println("\n===========================================");
            System.out.println("              🧠 PSYCHOLOGY");
            System.out.println("===========================================");

            System.out.println("\n📖 INTERNAL ARTICLES");
            System.out.println("-------------------------------------------");
            System.out.println("1. How Human Memory Works");
            System.out.println("2. Understanding Emotions");
            System.out.println("3. Why Do We Develop Habits?");
            System.out.println("4. The Psychology of Decision Making");
            System.out.println("5. How Attention and Focus Work");

            System.out.println("\n🌐 EXTERNAL RESOURCES");
            System.out.println("-------------------------------------------");
            System.out.println("6. Psychology - Simply Psychology");
            System.out.println("7. Memory - Britannica");
            System.out.println("8. Brain and Behaviour - APA");
            System.out.println("9. Psychology Videos - Crash Course");
            System.out.println("10. Psychology - Psychology Today");

            System.out.println("\n0. Back to Categories");
            System.out.println("===========================================");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    ArticleReader.humanMemory();
                    break;

                case 2:
                    ArticleReader.emotions();
                    break;

                case 3:
                    ArticleReader.habits();
                    break;

                case 4:
                    ArticleReader.decisionMaking();
                    break;

                case 5:
                    ArticleReader.attentionAndFocus();
                    break;

                case 6:
                    ExternalResource.open(
                        "Psychology - Simply Psychology",
                        "https://www.simplypsychology.org/"
                    );
                    break;

                case 7:
                    ExternalResource.open(
                        "Memory - Britannica",
                        "https://www.britannica.com/science/memory-psychology"
                    );
                    break;

                case 8:
                    ExternalResource.open(
                        "Brain and Behaviour - APA",
                        "https://www.apa.org/topics/brain"
                    );
                    break;

                case 9:
                    ExternalResource.open(
                        "Psychology Videos - Crash Course",
                        "https://www.youtube.com/@crashcourse"
                    );
                    break;

                case 10:
                    ExternalResource.open(
                        "Psychology - Psychology Today",
                        "https://www.psychologytoday.com/"
                    );
                    break;

                case 0:
                    System.out.println("\nReturning to Categories...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Try again.");
            }

        } while (choice != 0);
    }
}
