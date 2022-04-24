/**
 * Interface for Tune object
 * @author Chris Moore
 */
public interface Tune {
  /**
   * Returns artist name
   * @return first name + last name
   */
  public String getArtistName();

  /**
   * Returns display title
   * @return song title : album title
   */
  public String getDisplayTitle();

  /**
   * Returns song category
   * @return category
   */
  public String getCategory();
}
