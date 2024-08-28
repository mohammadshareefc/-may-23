
import java.util.Scanner;

// Define the Searchable interface with an abstract method search
interface Searchable {
    boolean search(String keyword);
}

// Document class implementing Searchable
class Document implements Searchable {
    private String text;

    // Constructor to initialize the document with text
    public Document(String text) {
        this.text = text;
    }

    // Implement the search method for Document
    @Override
    public boolean search(String keyword) {
        return text.contains(keyword);
    }
}

// WebPage class implementing Searchable
class WebPage implements Searchable {
    private String url;
    private String content;

    // Constructor to initialize the webpage with URL and content
    public WebPage(String url, String content) {
        this.url = url;
        this.content = content;
    }

    // Implement the search method for WebPage
    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

public class W5_02 {
    public static void main(String[] args) {
        // Create an instance of Document with sample content
        Scanner in = new Scanner(System.in);
        System.out.println("Enter document text:");
        String documentText = in.nextLine();
        Document document = new Document(documentText);
        
        System.out.println("Enter keyword to search in document:");
        String documentKeyword = in.nextLine();

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.search(documentKeyword);
        System.out.println("Document contains keyword '" + documentKeyword + "': " + documentContainsKeyword);

        // Create an instance of WebPage with sample URL and HTML content
        WebPage webPage = new WebPage("https://onlinecourses.nptel.ac.in", "This is a NPTEL online course webpage.");

        // Search for a keyword in the webpage and store the result
        String webPageKeyword = "webpage";
        boolean webPageContainsKeyword = webPage.search(webPageKeyword);
        System.out.println("Webpage contains keyword '" + webPageKeyword + "': " + webPageContainsKeyword);

        in.close();
    }
}
