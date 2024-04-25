package hust.soict.dsai.aims.Store;


import hust.soict.dsai.aims.Media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store with capacity for 5 DVDs
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 14.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 12.99f);

        // Add DVDs to the store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        
        // Remove DVDs to the store
        store.removeMedia(dvd3);
        
        // Test
        System.out.println();
      
    }
}