/**
 * This class uses methods inherited from Iterator to iterate the Exercise array
 * @author Chris Moore
 */
public class ExerciseIterator implements Iterator {
  
  private Exercise[] exercises;
  private int position = 0;

  /**
   * Iterator constructor
   * @param exercises Exercise array
   */
  public ExerciseIterator(Exercise[] exercises) {
    this.exercises = exercises;
  }

  /**
   * Returns a boolean based on whether or not the next element of
   * the array is null or not.
   */
  public boolean hasNext() {
    if (position >= exercises.length || exercises[position] == null) {
      return false;
    } 
    else {
      return true;
    }
  }

  /**
   * Iterates the array to the next element.
   */
  public Exercise next() {
    Exercise exercise = exercises[position];
    position += 1;
    return exercise;
  }
}
