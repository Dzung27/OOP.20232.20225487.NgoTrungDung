package hust.soict.dsai.aims.Media;

import java.util.ArrayList;

public class CompactDisc extends Media implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public String getArtist() {
		return artist;
	}
	public CompactDisc(int id, String title, String category, float cost, String artist) {
		super(id, title, category, cost);
		this.artist = artist;
	}
	public ArrayList<Track> getTracks() {
        return new ArrayList<>(tracks);
    }
	// Add author to the list of authors if not already present
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }
    // Remove author from the list of authors if present
    public void removeAuthor(Track track) {
        tracks.remove(track);
    }
    public int getTotalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Length: " + this.getTotalLength());
        for (Track track : tracks) {
            track.play();
        }
	}
	public String toString() {
	    return "CD: Title - " + getTitle() + ", Artist - " + getArtist() + ", Cost - $" + getCost();
	}
}