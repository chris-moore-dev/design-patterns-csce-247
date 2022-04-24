/**
 * Class for non-standard old style songs
 */
public class Oldie implements Tune {
  private String artistName;
  private String songTitle;
  private String recordTitle;
  private String category;

  /**
   * Default constructor for Oldie
   * @param artistName artist full name
   * @param songTitle song title
   * @param recordTitle album title
   * @param category genre
   */
  Oldie(String artistName, String songTitle, String recordTitle, String category) {
    this.artistName = artistName;
    this.songTitle = songTitle;
    this.recordTitle = recordTitle;
    this.category = category;
  }

  /**
   * Return artist full name
   */
  public String getArtistName(){
    return this.artistName;
  }

  /**
   * Return song title : record title
   */
  public String getDisplayTitle() {
    return this.songTitle + ":" + this.recordTitle;
  }

  /**
   * Return song genre
   */
  public String getCategory() {
    return this.category;
  }
}