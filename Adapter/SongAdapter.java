public class SongAdapter extends Song {
  private Tune tune;

  SongAdapter(Tune tune) {
    this.tune = tune;
  }

  public String getTitle() {
    String str = tune.getDisplayTitle();
    String[] arr = str.split(":", 2);
    return arr[0];
  }

  public String getAlbum() {
    String str = tune.getDisplayTitle();
    String[] arr = str.split(":", 2);
    return arr[1];
  }

  public String getArtistFirstName() {
    String str = tune.getArtistName();
    String[] arr = str.split("\\s+", 2);
    return arr[0];
  }

  public String getArtistLastName() {
    String str = tune.getArtistName();
    String[] arr = str.split("\\s+", 2);
    return arr[1];
  }

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
