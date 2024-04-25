package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.Media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart.Cart;

public class CartTest {
	public static void main(String[] args ) {
		//Create a new cart
		Cart cart = new Cart();

		//Create new dvd objects and add them to the cart

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger ALtLers", 87, 19.95f);

		cart.addMedia( dvd1) ;

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2) ;

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Atadin",
		"Animation", 18.99f) ;
		cart.addMedia(dvd3) ;

		//Test the print method
		System.out.println(cart);
		System.out.println("Total Cost is: "+cart.totalCost()); 
	}
}