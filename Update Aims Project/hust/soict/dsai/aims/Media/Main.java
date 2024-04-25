package hust.soict.dsai.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();

        // Add some Media objects to the list
        mediaList.add(new CompactDisc(0, "Music CD", "Artist", 12.99f, null));
        mediaList.add(new DigitalVideoDisc("Movie DVD", "Director", null, 120, 19.99f));
        mediaList.add(new Book(0, "Novel", "Author", 9.99f));

        // Print the unsorted list
        System.out.println("Unsorted Media list:");
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
        
        // Sort the list by title first, then by cost
        Media.sortByTitleThenCost(mediaList);

        // Print the sorted list
        System.out.println("\nSorted Media list by title then cost:");
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
        
        // Sort the list by cost first, then by title
        Media.sortByCostThenTitle(mediaList);

        // Print the sorted list
        System.out.println("\nSorted Media list by cost then title:");
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}
