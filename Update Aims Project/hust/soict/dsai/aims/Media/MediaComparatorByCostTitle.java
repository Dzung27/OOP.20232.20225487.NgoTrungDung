package hust.soict.dsai.aims.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		int costComparison = Float.compare(o2.getCost(), o1.getCost()); // Reverse order
        if (costComparison != 0) {
            return costComparison;
        }
        // If costs are the same, compare by title
        return o1.getTitle().compareTo(o2.getTitle());
	}

}
