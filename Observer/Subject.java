/**
 * Interface for StudentGovPoll, which inherits registerObserver(), removeObserver(), and notifyObserver()
 * @author Chris Moore
 */

public interface Subject {
  
  /**
   * Abstracted, adds observer object to ArrayList of observers
   * @param observer object to be added to list
   */
  public void registerObserver(Observer observer);

  /**
   * Abstracted, removes observer object from ArrayList
   * @param observer object to be removed from list
   */
  public void removeObserver(Observer observer);

  /**
   * Abstracted, updates observer object(s) with data from the subject
   */
  public void notifyObservers();

}
