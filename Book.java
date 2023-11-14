/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    System.out.println("Adding book " + t);
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }
  public int adjustRating(int r) {
    
    this.rating += r;
    r = 10;
    while ((this.rating > 10) || (this.rating < 0)) {
      continue;
    } 
    System.out.println("Adjusting rating by " + r);
    return this.rating;
    
  } 

  public boolean equals(Book b) {
    //System.out.println("Checking book " + b.title);
    if (this.title.equals(b.title) && this.author.equals(b.author)) {
      return true;
    }
    return false;
  }
  /*
  public String getInfo()
  {
     return "The current book information is " + info;
  }
*/
  
}
