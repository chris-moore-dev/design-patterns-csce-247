import java.util.ArrayList;

/**
 * Contains functions and variables for MusicBox object, 
 * which manages state switching and playing the selected song
 * @author Chris Moore
 */
public class MusicBox {
  State englishState;
  State frenchState;
  State spanishState;
  State state;

  /**
   * Default constructor for MusicBox
   */
  public MusicBox() {
    englishState = new EnglishState(this);
    frenchState = new FrenchState(this);
    spanishState = new SpanishState(this);
    state = englishState;
  }

  /**
   * Calls playSong() for selected state's version of "Twinkle Twinkle Little Star"
   */
  public void pressStarButton() {
    state.pressStarButton();
  }

  /**
   * Calls playSong() for selected state's version of "If You're Happy and You Know It"
   */
  public void pressHappyButton() {
    state.pressHappyButton();
  }

  /**
   * Switches state to English mode
   */
  public void pressEnglishButton() {
    state.pressEnglishButton();
  }

  /**
   * Switches state to French mode
   */
  public void pressFrenchButton() {
    state.pressFrenchButton();
  }

  /**
   * Switches state to Spanish mode
   */
  public void pressSpanishButton() {
    state.pressSpanishButton();
  }

  /**
   * Sets the MusicBox's state to the selected state
   * @param state
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Returns the English state
   * @return englishState
   */
  public State getEnglishState() {
    return englishState;
  }

  /**
   * Returns the French state
   * @return frenchState
   */
  public State getFrenchState() {
    return frenchState;
  }

  /**
   * Returns the Spanish state
   * @return spanishState
   */
  public State getSpanishState() {
    return spanishState;
  }

  /**
   * Displays the specified song's name, and prints its lyrics with 1000ms display between each line
   * @param songName Name of the song
   * @param lyrics ArrayList containing the song's lyrics
   */
  public void playSong(String songName, ArrayList<String> lyrics) {
    System.out.println("\nPlaying: " + songName);
    for(int i = 0; i < lyrics.size(); i++) {
      try {
        Thread.sleep(1000);
      } 
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(lyrics.get(i));
    }
    System.out.println("");
  }
}
