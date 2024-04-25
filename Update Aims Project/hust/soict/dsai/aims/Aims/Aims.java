package hust.soict.dsai.aims.Aims;

import java.util.Scanner;

import hust.soict.dsai.aims.Media.Media;
import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart.Cart;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                viewStore();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                seeCurrentCart();
                break;
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showMenu();
        }
    }

    public static void viewStore() {
        store.displayItems();
        storeMenu();
    }

    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                seeCurrentCart();
                break;
            case 0:
                showMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                storeMenu();
        }
    }

    public static void seeMediaDetails() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine(); // Consume newline
        String title = scanner.nextLine();
        Media media = store.findMediaByTitle(title);
        if (media != null) {
            System.out.println(media.toString());
            mediaDetailsMenu();
        } else {
            System.out.println("Media not found.");
            storeMenu();
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addMediaToCart();
                break;
            case 2:
                playMedia();
                break;
            case 0:
                storeMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                mediaDetailsMenu();
        }
    }

    public static void addMediaToCart() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine(); // Consume newline
        String title = scanner.nextLine();
        Media media = store.findMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart.");
            System.out.println("Current cart:");
            cart.displayItems();
        } else {
            System.out.println("Media not found.");
        }
        storeMenu();
    }

    public static void playMedia() {
        System.out.println("Enter the title of the media:");
        scanner.nextLine(); // Consume newline
        String title = scanner.nextLine();
        Media media = store.findMediaByTitle(title);
        if (media != null) {
            media.play();
        } else {
            System.out.println("Media not found.");
        }
        storeMenu();
    }

    public static void updateStore() {
        // Implement logic to add or remove media from the store
        storeMenu();
    }

    public static void seeCurrentCart() {
        System.out.println("Current cart:");
        cart.displayItems();
        cartMenu();
    }

    public static void cartMenu() {
        // Implement logic for cart menu
    }
}

