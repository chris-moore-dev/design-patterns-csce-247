import java.util.HashMap;

public class TallyDisplay implements Observer {

  private Subject poll;

  private HashMap<String, Integer> votes;

  public TallyDisplay(Subject poll) {
    this.poll = poll;
    this.poll.registerObserver(this);
    
  }

  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }

  private void display() {
    System.out.println("\n" + "Current Tallies:");
    for (String i : votes.keySet()) {
      System.out.println(i + ": " + votes.get(i));
    }
  }
}
