import java.util.ArrayList;

/**
 * Sort method using Insertion Sort
 * @author Chris Moore
 */
public class InsertionSort implements SortBehavior {
    
    /**
     * Sorts by Insertion Sort
     * I referenced javatpoint (https://www.javatpoint.com/insertion-sort-in-java) for this method
     */
    public ArrayList<String> sort(ArrayList<String> data) {
        int length = data.size();
        for (int i = 1; i < length; i++) {
          String shift = data.get(i);
          int j = i - 1;
          while ( (j > -1) && (data.get(j).compareTo(shift) > 0)) {
            data.set((j+1), data.get(j));
            j--;
          }
          data.set((j+1), shift);
        }
      return data;
    }

}
