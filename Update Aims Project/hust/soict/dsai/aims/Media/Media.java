package hust.soict.dsai.aims.Media;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public abstract class Media {
	private int id;
    private String title;
    private String category;
    private float cost;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

	public Media(int id, String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
	public Media(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
        this.title = title;
        this.category = category;
        this.cost = cost;
	}
	public Media(String title) {
		// TODO Auto-generated constructor stub
        this.title = title;
	}
	@Override
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title != null ? title.equals(media.title) : media.title == null;
    }
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public static void sortByTitleThenCost(List<Media> collection) {
        Collections.sort(collection, COMPARE_BY_TITLE_COST);
    }

    // This method sorts the collection of Media objects by cost first, then by title
    public static void sortByCostThenTitle(List<Media> collection) {
        Collections.sort(collection, COMPARE_BY_COST_TITLE);
    }

	public void play() {
	}
}


