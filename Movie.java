public class Movie {
  private String title;
  private double duration;
  private int rating;
  
  public Movie(String t, double d) {
    title = t;
    duration = d;
    rating = 0;
  }
  
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
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

  public String toString() {
    String info = "\"" + title + "\", duration: " + duration + " hours";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie m) {
    if (this.title.equals(m.title) && this.duration == m.duration) {
      return true;
    }
    return false;
  }
}