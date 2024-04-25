package hust.soict.dsai.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
	    public static void main(String[] args) {
	        // Create instances of CD, DVD, and Book
	        CompactDisc cd = new CompactDisc(0, "Music CD", "Artist", 12.99f, null);
	        DigitalVideoDisc dvd = new DigitalVideoDisc("Movie DVD", "Director",19.99f);
	        Book book = new Book(1,"Novel", "Author", 9.99f);

	        // Create an ArrayList of Media
	        List<Media> mediae = new ArrayList<>();
	        mediae.add(cd);
	        mediae.add(dvd);
	        mediae.add(book);

	        // Iterate over the list and print out information using toString()
	        for (Media m : mediae) {
	            System.out.println(m.toString());
	        }
	    }
	}