import java.util.HashMap;

/**
 * Creates an object of type Observer which can be updated from the Subject
 * and called upon to display poll data in a tally format
 * @author Chris Moore
 */

public class TallyDisplay implements Observer {

  private Subject poll;

  private HashMap<String, Integer> votes;

  /**
   * Constructor for object "poll"
   * @param poll type Subject, draws data from subject
   */
  public TallyDisplay(Subject poll) {
    this.poll = poll;
    this.poll.registerObserver(this);
    
  }

  /**
   * Updates poll data when prompted by Subject.notifyObserver(),
   * calls display() function
   * @param votes HashMap containing all poll data
   */
  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }

  /**
   * Displays poll data in tally form
   */
  private void display() {
    System.out.println("\n" + "Current Tallies:");
    for (String i : votes.keySet()) {
      System.out.println(i + ": " + votes.get(i));
    }
  }
}
