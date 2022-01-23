import java.util.HashMap;
import java.text.DecimalFormat;

public class PercentageDisplay implements Observer {
  
  private Subject poll;

  private HashMap<String, Integer> votes;

  private int numVotes;

  public PercentageDisplay(Subject poll) {
    this.poll = poll;
    this.poll.registerObserver(this);
  }

  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }

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
