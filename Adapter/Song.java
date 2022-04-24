/**
 * Abstract class for different types of songs
 */
public abstract class Song {
  /**
   * Get song title
   * @return song title
   */
  public abstract String getTitle();

  /**
   * Get album title
   * @return album title
   */
  public abstract String getAlbum();

  /**
   * Get artist first name
   * @return artist first name
   */
  public abstract String getArtistFirstName();

  /**
   * Get artist last name
   * @return artist last name
   */
  public abstract String getArtistLastName();

  /**
   * Get song genre
   * @return song genre
   */
  public abstract String getGenre();

  /**
   * Return song information to be displayed by the jukebox
   */
  public String toString() {
    return getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " + getArtistFirstName() + " " + getArtistLastName() + "\nGenre: " + getGenre();
  }
}