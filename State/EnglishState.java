import java.util.ArrayList;

/**
 * Contains lyrics for all English songs
 * @author Chris Moore
 */
public class EnglishState implements State {
  private MusicBox box;

  /**
   * Sets MusicBox state to English
   */
  public EnglishState(MusicBox box) {
    this.box = box;
  }

  /**
   * Creates ArrayList containing lyrics for "Twinkle Twinkle Little Star"
   * in English, and calls playSong();
   */
  public void pressStarButton() {
    String songName = "Twinkle, twinkle, little star";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Up above the world so high");
    lyrics.add("Like a diamond in the sky");
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Up above the world so high");
    lyrics.add("Like a diamond in the sky");
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Up above the world so high");
    lyrics.add("Like a diamond in the sky");
    lyrics.add("Twinkle, twinkle, little star");
    lyrics.add("How I wonder what you are");
    box.playSong(songName, lyrics);
  }

  /**
   * Creates ArrayList containing lyrics for "If You're Happy and You Know It"
   * in English, and calls playSong();
   */
  public void pressHappyButton() {
    String songName = "If you're happy and you know it";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("If you're happy and you know it clap your hands");
    lyrics.add("If you're happy and you know it clap your hands");
    lyrics.add("If you're happy and you know it");
    lyrics.add("And you really want to show it");
    lyrics.add("If you're happy and you know it clap your hands");
    lyrics.add("If you're happy and you know it stomp your feet");
    lyrics.add("If you're happy and you know it stomp your feet");
    lyrics.add("If you're happy and you know it");
    lyrics.add("And you really want to show it");
    lyrics.add("If you're happy and you know it stomp your feet");
    lyrics.add("If you're happy and you know it nod your head");
    lyrics.add("If you're happy and you know it nod your head");
    lyrics.add("If you're happy and you know it");
    lyrics.add("And you really want to show it");
    lyrics.add("If you're happy and you know it nod your head");
    lyrics.add("If you're happy and you know it do all three");
    lyrics.add("If you're happy and you know it do all three");
    lyrics.add("If you're happy and you know it");
    lyrics.add("And you really want to show it");
    lyrics.add("If you're happy and you know it do all three");
    box.playSong(songName, lyrics);
  }

  /**
   * Alerts the user they are already in English mode
   */
  public void pressEnglishButton() {
    System.out.println("You are already in English mode");
  }

  /**
   * Switches state to French mode
   */
  public void pressFrenchButton() {
    System.out.println("Switching to French");
    box.setState(box.frenchState);
  }

  /**
   * Switches state to Spanish mode
   */
  public void pressSpanishButton() {
    System.out.println("Switching to Spanish");
    box.setState(box.spanishState);
  }

}
