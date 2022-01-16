import java.util.ArrayList;

/**
 * Interface for choosing sorting method
 * @author Chris Moore
 */
public interface SortBehavior {

  /**
   * Abstracted method, chooses from child class
   * to sort ArrayList
   * @param data ArrayList
   */
  public ArrayList<String> sort(ArrayList<String> data);
  
}