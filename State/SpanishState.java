import java.util.ArrayList;

/**
 * Contains lyrics for all Spanish songs
 * @author Chris Moore
 */
public class SpanishState implements State {
  private MusicBox box;

  /**
   * Sets MusicBox state to Spanish
   */
  public SpanishState(MusicBox box) {
    this.box = box;
  }

  /**
   * Creates ArrayList containing lyrics for "Twinkle Twinkle Little Star"
   * in Spanish, and calls playSong();
   */
  public void pressStarButton() {
    String songName = "Estrellita, ¿dónde estás?";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("Estrellita, ¿dónde estás?");
    lyrics.add("Quiero verte cintilar");
    lyrics.add("en el cielo, sobre el mar.");
    lyrics.add("Un diamante de verdad.");
    lyrics.add("Estrellita, ¿dónde estás?");
    lyrics.add("Quiero verte cintilar.");
    lyrics.add("Es muy tarde. El sol se va.");
    lyrics.add("Ya la noche llegará.");
    lyrics.add("Ven aquí a iluminar.");
    lyrics.add("Brilla, brilla sin parar.");
    lyrics.add("Estrellita, ¿dónde estas?");
    lyrics.add("Quiero verte a ti brillar");
    box.playSong(songName, lyrics);
  }

  /**
   * Creates ArrayList containing lyrics for "If You're Happy and You Know It"
   * in Spanish, and calls playSong();
   */
  public void pressHappyButton() {
    String songName = "Si usted esta feliz";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("Si usted esta feliz Apaluda las fuerte.");
    lyrics.add("Clap, Clap.");
    lyrics.add("Si usted esta feliz Apaluda las fuerte.");
    lyrics.add("Clap, Clap.");
    lyrics.add("Si usted esta feliz ");
    lyrics.add("En su cara se vera.");
    lyrics.add("Si usted esta feliz ");
    lyrics.add("En su cara se vera.");
    lyrics.add("Clap, Clap.");
    lyrics.add("Si usted esta feliz Dese un brazo.");
    lyrics.add("Hug yourself.");
    lyrics.add("Si usted esta feliz Dese un brazo.");
    lyrics.add("Hug yourself.");
    lyrics.add("Si usted esta feliz");
    lyrics.add("En su cara se vera.");
    lyrics.add("Si usted esta feliz");
    lyrics.add("Dese un brazo.");
    lyrics.add("Hug yourself.");
    box.playSong(songName, lyrics);
  }

  /**
   * Switches state to English mode
   */
  public void pressEnglishButton() {
    System.out.println("Switching to English");
    box.setState(box.englishState);
  }

  /**
   * Switches state to French mode
   */
  public void pressFrenchButton() {
    System.out.println("Switching to French");
    box.setState(box.frenchState);
  }

  /**
   * Alerts the user they are already in Spanish mode
   */
  public void pressSpanishButton() {
    System.out.println("You are already in Spanish mode");
  }

}
