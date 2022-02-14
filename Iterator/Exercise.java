import java.util.ArrayList;

/**
 * Creates and contains function for Exercise object
 * @author Chris Moore
 */
public class Exercise {
  
  private String title;
  private ArrayList<String> targetMuscles;
  private ArrayList<String> directions;

  /**
   * Default constructor for Exercise object
   * @param title title of exercise
   */
  public Exercise(String title) {
    this.title = title;
  }

  /**
   * Alternate constructor for Exercise object
   * @param title Name of exercise
   * @param targetMuscles Muscles groups targeted by exercise
   * @param directions Directions for exercise
   */
  public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
    this.title = title;
    this.targetMuscles = targetMuscles;
    this.directions = directions;
  }

  /**
   * Function for adding target muscle to Exercise[]
   * @param muscle Target muscle
   */
  public void addTargetMuscle(String muscle) {
    targetMuscles.add(muscle);
  }

  /**
   * Function for removing target muscle from Exercise[]
   * @param muscle Target muscle
   */
  public void removeTargetMuscle(String muscle) {
    targetMuscles.remove(muscle);
  }

  /**
   * Prints exercise information to console
   */
  public String toString() {
    String output = "";
    String strTitle = "... " + title + " ...\n";
    String strTargetMuscles = "Muscles: ";
    for (int i = 0; i < targetMuscles.size(); i++) {
      strTargetMuscles += " " + targetMuscles.get(i);
      if (i < targetMuscles.size() - 1) {
        strTargetMuscles += ",";
      }
    }
    strTargetMuscles += "\n";
    String strDirections = "Exercises: \n"; 
    for (int i = 0; i < directions.size(); i++) {
      strDirections += "-" + directions.get(i);
      if (i <= directions.size() - 1) {
        strDirections += "\n";
      }
    }
    strDirections += "\n";
    output = strTitle + strTargetMuscles + strDirections;
    return output;
  }
}
