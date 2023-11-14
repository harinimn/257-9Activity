/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries;
  
  public void addMovie(Movie m) 
  {
    if (numEntries <= 1) {
      movie = m;
      // step 15
      MediaLib.numEntries += 1;
    } else {
      System.out.println("Cannot add a new movie: A movie already exists");
    }
    
  }
  public void addBook(Book b)
  {
    if (numEntries <= 1) {
      book = b;
      // step 15
      MediaLib.numEntries += 1;
    } else {
      System.out.println("Cannot add a new book: A book already exists");
    }
  }

  public void addSong(Song s)
  {
    if (numEntries <= 1) {
      song = s;
      // step 15
      MediaLib.numEntries += 1;
    } else {
      System.out.println("Cannot add a new song: A song already exists");
    }
  }

  // public String toString() 
  // {
  //   String info = "";
  //   System.out.prinltn(myBook.toString());
  //   return info;

  //   String movie_info = "";
  //   System.out.println(myMovie.toString());
  //   return movie_info;
  // }

  // public void testBook(Book tester) {
  //   tester.setTitle("test");
  //   System.out.println(tester.getTitle());
  //   System.out.println(myBook.getTitle());
  // }

  public static String getOwner() {
    return owner;
  }

  public static String changeOwner(String newOwner) {
    owner = newOwner;
    return owner;
  }

  public static int getNumEntries() {
    // System.out.println("Test: Owner is " + owner);
    return numEntries;
  }
}