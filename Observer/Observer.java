import java.util.HashMap;

/**
 * Interface for TallyDisplay and PercentageDisplay classes, which inherit update()
 * @author Chris Moore
 */

public interface Observer {
 
  /**
   * Abstracted, updates observer objects with data from the subject
   * @param votes HashMap which contains all poll data
   */
  public void update(HashMap<String, Integer> votes);

}
