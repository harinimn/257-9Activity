public class Song
{
  private String title;
  private int rating;

  public Song(String t)
  {
    title = t;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public String toString() 
  {
    String info = "\"" + title + "\", rating is " + rating;
    return info;
  }

  public void setTitle(String t) {
    title = t;
  }

  public int adjustRating(int r) {
    rating += r;
    if (rating > 10) {
      rating = 10;
    } else if (rating < 0) {
      rating = 0;
    }
    return rating;
  }

  public boolean equals(Song s) {
    if (this.title.equals(s.title)) {
      return true;
    }
    return false;
  }
}