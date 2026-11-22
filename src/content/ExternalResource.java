
package content;

import java.awt.Desktop;
import java.net.URI;

public class ExternalResource {

    public static void open(String title, String url) {

        System.out.println("\nOpening: " + title);

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(URI.create(url));
                System.out.println("Resource opened in your browser.");
            } else {
                System.out.println("Open this link manually:");
                System.out.println(url);
            }

        } catch (Exception e) {
            System.out.println("Unable to open the browser.");
            System.out.println("Link: " + url);
        }
    }
}
