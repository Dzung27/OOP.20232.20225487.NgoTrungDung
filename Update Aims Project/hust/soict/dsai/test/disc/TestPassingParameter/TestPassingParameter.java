package hust.soict.dsai.test.disc.TestPassingParameter;

import hust.soict.dsai.aims.Media.DigitalVideoDisc;

public class TestPassingParameter {

public static void main(String[] args) {
// TODO Auto-generated method stub
	DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle"); 
	DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
	swap(jungleDVD, cinderellaDVD);
	System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
	System.out.println("jungle dvd title: " + jungleDVD.getTitle());

}

public static void swap(Object o1 , Object o2) {
		Object tmp = o1;
		o1 = o2; 
		o2 = tmp;
	}

public static void changeTitle(DigitalVideoDisc dvd, String title) { 
	String oldTitle = dvd.getTitle(); 
	dvd = new DigitalVideoDisc(oldTitle);
	}
}
// answers question
//● After the call of swap(jungleDVD, cinderellaDVD) why does the title of these two 
//objects still remain? ------ Still remain
//● After the call of changeTitle(jungleDVD, cinderellaDVD.getTitle()) why is 
//the title of the JungleDVD changed? ----- Has changed