import java.util.ArrayList;

/**
 * Contains lyrics for all French songs
 * @author Chris Moore
 */
public class FrenchState implements State {
  private MusicBox box;
  
  /**
   * Sets MusicBox state to French
   */
  public FrenchState(MusicBox box) {
    this.box = box;
  }

  /**
   * Creates ArrayList containing lyrics for "Twinkle Twinkle Little Star"
   * in French, and calls playSong();
   */
  public void pressStarButton() {
    String songName = "Brille, brille, petite étoile";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("Brille, brille, petite étoile,");
    lyrics.add("Je me demande vraiment ce que tu es!");
    lyrics.add("Au-dessus du monde si haut,");
    lyrics.add("Comme un diamant dans le ciel.");
    lyrics.add("Brille, brille, petite étoile,");
    lyrics.add("Je me demande vraiment ce que tu es!");
    box.playSong(songName, lyrics);
  }

  /**
   * Creates ArrayList containing lyrics for "If You're Happy and You Know It"
   * in French, and calls playSong(); 
   */
  public void pressHappyButton() {
    String songName = "Si tu as d' la joie au cœur";
    ArrayList<String> lyrics = new ArrayList<>();
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe des mains");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe des mains");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe des mains");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe du pied");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe du pied");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Frappe du pied");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Claque la langue");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Claque la langue");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Claque la langue");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Dis merci – merci");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Dis merci – merci");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Si tu as d' la joie au cœur");
    lyrics.add("Dis merci – merci");
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
   * Alerts the user they are already in French mode
   */
  public void pressFrenchButton() {
    System.out.println("You are already in French mode");
  }

  /**
   * Switches state to Spanish mode
   */
  public void pressSpanishButton() {
    System.out.println("Switching to Spanish");
    box.setState(box.spanishState);
  }

}
