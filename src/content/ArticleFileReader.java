
package content;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.Scanner;
import main.Navigation;

public class ArticleFileReader {

    public static void showArticle(Scanner s, String category, String fileName) {

        Path path = Path.of("articles", category, fileName);

        try {

            String content = Files.readString(
                path, StandardCharsets.UTF_8
            );

            String title = fileName.replace(".txt", "")
                                   .replace("_", " ");

            String[] banner = {
                "",
                "===============================================================",
                "                         📚 CEREVIA",
                "                    LONG-FORM READING HUB",
                "===============================================================",
                "📂 Category : " + category,
                "",
                "---------------------------------------------------------------",
                "                 📖 " + title.toUpperCase(),
                "---------------------------------------------------------------",
                ""
            };

            for (String line : banner) {
                System.out.println(line);
            }

            // Display article with fixed width
            int width = 65;

            String[] paragraphs = content.split("\\R");

            for (String paragraph : paragraphs) {

                paragraph = paragraph.trim();

                if (paragraph.isEmpty()) {
                    System.out.println();
                    continue;
                }

                String[] words = paragraph.split("\\s+");

                StringBuilder line = new StringBuilder();

                for (String word : words) {

                    if (line.length() == 0) {
                        line.append(word);
                    }
                    else if (line.length() + word.length() + 1 <= width) {
                        line.append(" ").append(word);
                    }
                    else {
                        System.out.println("  " + line);
                        line = new StringBuilder(word);
                    }
                }

                if (line.length() > 0) {
                    System.out.println("  " + line);
                }

                System.out.println();
            }

            String[] ending = {
                "---------------------------------------------------------------",
                "                     ✨ END OF ARTICLE",
                "---------------------------------------------------------------",
                "",
                "🌱 Keep reading. Keep learning. Keep growing!"
            };

            for (String line : ending) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println("\n❌ Unable to open article: " + fileName);
            System.out.println("💡 Check the file name and folder location.");
        }

        // Article navigation
        while (!Navigation.exitRequested) {

            String[] options = {
                "0. ↩️ Return to Category Menu",
                "00. 🚪 Exit CEREVIA"
            };

            System.out.println();

            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("\n👉 Enter your choice (0 / 00): ");

            String input = s.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Empty input! Please enter 0 or 00.");
                continue;
            }

            if (input.equals("0")) {
                return;
            }

            if (input.equals("00")) {
                Navigation.exitApplication();
                return;
            }

            System.out.println("❌ Invalid choice! Enter 0 or 00.");
        }
    }
}
