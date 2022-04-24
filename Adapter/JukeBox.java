import java.util.HashMap;

public class JukeBox {
  private HashMap<String, Song> songs = new HashMap<>();
  private int currentSong; // This doesn't appear to serve any purpose

  JukeBox() {

  }

  public void addSong(Song song) {
    songs.put(song.getTitle().toLowerCase(), song);
  }

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
