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
	public void displayItems() {
	        System.out.println("Items in store:");
	        System.out.println("--------------------------------");
	        for (Media media : itemsInStore) {
	            System.out.println(media.toString());
	        }
	        System.out.println("--------------------------------");
	    }

	public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null; 
	}
	}