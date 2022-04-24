/**
 * Class for implementing standard songs into the jukebox
 * @author Chris Moore
 */
public class Track extends Song {
  private String title;
  private String album;
  private String firstName;
  private String lastName;
  private Genre genre;

  /**
   * Default constructor for Track object
   * @param title song title
   * @param album song album
   * @param firstName artist first name
   * @param lastName artist last name
   * @param genre song genre
   */
  Track(String title, String album, String firstName, String lastName, Genre genre) {
    this.title = title;
    this.album = album;
    this.firstName = firstName;
    this.lastName = lastName;
    this.genre = genre;
  }

  /**
   * Returns song title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Returns album title
   */
  public String getAlbum() {
    return this.album;
  }

  /**
   * Returns artist first name
   */
  public String getArtistFirstName() {
    return this.firstName;
  }

  /**
   * Returns artist last name
   */
  public String getArtistLastName() {
    return this.lastName;
  }

  /**
   * Returns song genre (if-statements for setting to standard case)
   */
  public String getGenre() {
    if(this.genre.name() == "ROCK") {
      return "Rock";
    }
    if(this.genre.name() == "POP") {
      return "Pop";
    }
    if(this.genre.name() == "HIPHOP") {
      return "Hip-hop";
    }
    if(this.genre.name() == "JAZZ") {
      return "Jazz";
    }
    if(this.genre.name() == "COUNTRY") {
      return "Country";
    }
    else {
      return "Other";
    }
  }
}