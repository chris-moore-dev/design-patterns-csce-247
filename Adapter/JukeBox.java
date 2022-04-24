import java.util.HashMap;

/**
 * Contains functions for adding and playing songs
 * @author Chris Moore
 */
public class JukeBox {
  private HashMap<String, Song> songs = new HashMap<>();
  private int currentSong; // This doesn't appear to serve any purpose

  /**
   * Empty constructor for JukeBox
   */
  JukeBox() {

  }

  /**
   * Adds song to songs HashMap, using song title as key
   * @param song song to be added
   */
  public void addSong(Song song) {
    songs.put(song.getTitle().toLowerCase(), song);
  }

  /**
   * Prints song.toString if song is found, otherwise print error message
   * @param songName song name
   */
  public void play(String songName) {
    String newSong = songName.toLowerCase();
    if(songs.get(newSong) != null) {
      System.out.println(songs.get(newSong).toString() + "\n");
    }
    else {
      System.out.println("Sorry, '" + songName +"' is not available!\n");
    }
  }
}