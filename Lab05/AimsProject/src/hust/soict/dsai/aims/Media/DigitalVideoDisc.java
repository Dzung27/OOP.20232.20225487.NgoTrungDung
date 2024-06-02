package hust.soict.dsai.aims.Media;

public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title) {
		super(title);

	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}
    
}