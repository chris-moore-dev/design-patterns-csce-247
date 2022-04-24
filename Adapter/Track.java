public class Track extends Song {
  private String title;
  private String album;
  private String firstName;
  private String lastName;
  private Genre genre;

  Track(String title, String album, String firstName, String lastName, Genre genre) {
    this.title = title;
    this.album = album;
    this.firstName = firstName;
    this.lastName = lastName;
    this.genre = genre;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAlbum() {
    return this.album;
  }

  public String getArtistFirstName() {
    return this.firstName;
  }

  public String getArtistLastName() {
    return this.lastName;
  }

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
