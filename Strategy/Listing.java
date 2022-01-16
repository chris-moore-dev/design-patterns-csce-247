import java.util.ArrayList;

/**
 * A constructor for an ArrayList of type String, including 
 * several methods to alter and access its elements
 * @author Chris Moore
 */
public class Listing {

    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior = new BubbleSort();

    /**
     * Constructor for object Listing
     * @param title title of the ArrayList
     */
    public Listing(String title) {
      this.title = title;
      items = new ArrayList<>();
    }

    /**
     * Adds elements into the ArrayList
     * @param item the string to be added
     */
    public void add(String item) {
      items.add(item);
    }

    /**
     * Removes elements from the ArrayList
     * @param item the string to be removed
     */
    public void remove(String item) {
      items.remove(item);
    }

    /**
     * Returns the title of the ArrayList
     * @return title of the ArrayList
     */
    public String getTitle() {
      return title;
    }

    /**
     * Chooses which method to sort the ArrayList by
     * @param sortBehavior InsertionSort or BubbleSort
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
      this.sortBehavior = sortBehavior;
    }

    /**
     * Returns the sorted ArrayList
     * @return Sorted ArrayList
     */
    public ArrayList<String> getSortedList() {
      sortBehavior.sort(items);
      return items;
    }

    /**
     * Returns the original ArrayList
     * @return Unaltered ArrayList
     */
    public ArrayList<String> getUnsortedList() {
      return items;
    }

}
