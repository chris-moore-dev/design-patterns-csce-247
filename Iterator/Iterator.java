/**
 * This class is merely an interface for ExerciseIterator and contains no method bodies
 * @author Chris Moore
 */
public interface Iterator {

  /**
   * Abstracted method, checks whether next element is valid or not
   */
  public boolean hasNext();

  /**
   * Abstracted method, iterates array to next element
   */
  public Object next();

}
