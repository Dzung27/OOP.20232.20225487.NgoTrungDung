package hust.soict.dsai.aims.Media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media{
    private List<String> authors = new ArrayList<>();
    public Book(int id, String title, String category, float cost) {
    	super(id, title, category, cost);
    }
    public List<String> getAuthors() {
        return authors;
    }

    // Add author to the list of authors if not already present
    public void addAuthor(String author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    // Remove author from the list of authors if present
    public void removeAuthor(String author) {
        authors.remove(author);
    }

    // Clear all authors from the list
    public void clearAuthors() {
        authors.clear();
    }
    public String toString() {
        return "Book: Title - " + getTitle() + ", Author - " + getAuthors() + ", Cost - $" + getCost();
    }
    
}
