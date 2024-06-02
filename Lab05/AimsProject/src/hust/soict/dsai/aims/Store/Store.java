package hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.Media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media added to store: " + media.getTitle());
    }

    public boolean removeMedia(Media media) {
        boolean removed = itemsInStore.remove(media);
        if (removed) {
            System.out.println("Media removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in store.");
        }
        return removed;
    }

    public void listMedia() {
        System.out.println("Media in Store:");
        for (Media media : itemsInStore) {
            System.out.println(media);
        }
    }
}