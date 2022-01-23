import java.util.HashMap;
import java.text.DecimalFormat;

/**
 * Creates an object of type Observer which can be updated from the Subject
 * and called upon to display poll data in a percentage format
 * @author Chris Moore
 */

public class PercentageDisplay implements Observer {
  
  private Subject poll;

  private HashMap<String, Integer> votes;

  private int numVotes;

  /**
   * Constructor for object "poll"
   * @param poll type Subject, draws data from subject
   */
  public PercentageDisplay(Subject poll) {
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
   * Displays poll data in percentage form, rounded to one decimal place
   */
  private void display() {
    for (String i : votes.keySet()) {
      numVotes += votes.get(i);
    }
    System.out.println("\n" + "Current Percent of Votes:");
    for (String i : votes.keySet()) {
      double temp = (double)votes.get(i);
      double numVotesDouble = (double)numVotes;
      double percent = (temp / numVotesDouble) * 100;

      DecimalFormat round = new DecimalFormat("##.0");
      System.out.println(i + ": " + round.format(percent) + "%");
      // I got the usage for DecimalFormat from Stack Exchange (https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java)
    }
  }
}
