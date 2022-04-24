/**
 * Class for adapting tunes into the jukebox
 * @author Chris Moore
 */
public class SongAdapter extends Song {
  private Tune tune;

  /**
   * Default constructor for SongAdapter
   * @param tune Tune to be adapted
   */
  SongAdapter(Tune tune) {
    this.tune = tune;
  }

  /**
   * Splits tune.displayTitle and takes first element
   */
  public String getTitle() {
    String str = tune.getDisplayTitle();
    String[] arr = str.split(":", 2);
    return arr[0];
  }

  /**
   * Splits tune.displayTitle and takes second element
   */
  public String getAlbum() {
    String str = tune.getDisplayTitle();
    String[] arr = str.split(":", 2);
    return arr[1];
  }

  /**
   * Splits tune.artistName and takes first element
   */
  public String getArtistFirstName() {
    String str = tune.getArtistName();
    String[] arr = str.split("\\s+", 2);
    return arr[0];
  }

  /**
   * Splits tune.artistName and takes second element
   */
  public String getArtistLastName() {
    String str = tune.getArtistName();
    String[] arr = str.split("\\s+", 2);
    return arr[1];
  }

  /**
   * Adapts Tune genres into standard style
   */
  public String getGenre() {
    if(tune.getCategory() == "Country and Western") {
      return "Country";
    }
    if(tune.getCategory() == "R&B and Soul") {
      return "Hiphop";
    }
    if(tune.getCategory() == "Easy Listening") {
      return "Pop";
    }
    if(tune.getCategory() == "Rock") {
      return "Rock";
    }
    if(tune.getCategory() == "Classic Rock") {
      return "Rock";
    }
    else {
      return "Other";
    }
  }
}