import java.util.ArrayList;

/**
 * Sort method using Bubble Sort
 * @author Chris Moore
 */
public class BubbleSort implements SortBehavior {

    /**
     * Sorts by Bubble Sort
     * I referenced 
     */
    public ArrayList<String> sort(ArrayList<String> data) {

      // I referenced javatpoint (https://www.javatpoint.com/bubble-sort-in-java) for this method
      int length = data.size();
      String temp = "";
      for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
          if(data.get(i).compareTo(data.get(j)) > 0) {
            temp = data.get(i);
            data.set(i, data.get(j));
            data.set(j, temp);
          }
        }
      }
      return data;
    }

}