import java.util.ArrayList; 
import java.util.HashMap;

/**
 * Creates an object of type Subject to be read by observer classes
 * @author Chris Moore
 */
public class StudentGovPoll implements Subject {
  
  private ArrayList<Observer> observers;
  private HashMap<String, Integer> votes;
  private String school;
  private int numUpdates;

  /**
   * Constructor for StudentGovPoll, initializes ArrayList "observers" and HashMap "votes"
   * @param school String of school name
   */
  public StudentGovPoll(String school) {
    observers = new ArrayList<Observer>();
    votes = new HashMap<String, Integer>();
    this.school = school;

  }

  /**
   * Adds observer to ArrayList of observers
   * @param observer observer to be added
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * Removes observer from ArrayList of observers
   * @param observer observer to be removed
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Tells observers that data in the subject has changed
   */
  public void notifyObservers() {
      for(Observer observer : observers) {
        observer.update(votes);
      }
  }

  /**
   * Sets keys of HashMap with value 0
   * @param president key of HashMap
   */
  public void addCandidate(String president) {
    votes.put(president, 0);
  }

  /**
   * Keeps track of each candidate in the HashMap and updates their votes accordingly
   * @param president Key of HashMap, candidate in poll
   * @param num Value of HashMap, number of votes per candidate
   */
  public void enterVotes(String president, int num) {
    Integer temp = votes.get(president);
    temp += num;
    votes.put(president, temp);
    numUpdates++;
    if (numUpdates % 4 == 0) {
      notifyObservers();
    }
  }

  /**
   * Fetches name of school
   * @return String "school"
   */
  public String getSchool() {
    return school;
  }
}
