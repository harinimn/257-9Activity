/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);

    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    myBook.setTitle("The Great Gatsby");
    System.out.println("Book:" + myBook);
    System.out.println("Library: " + myLib);

    myBook.setAuthor("Fitzgerald");

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    Book newBook2 = new Book("1984", "Orwell");
    System.out.println(newBook.equals(newBook2));

    Movie myMovie = new Movie("The Matrix", 4.5);
    System.out.println("Movie: " + myMovie);
    myLib.addMovie(myMovie);
    System.out.println("Library: " + myLib);
    
    Movie newMovie = new Movie("The Matrix", 4.5);
    System.out.println("Movie: " + newMovie);
    System.out.println("Library: " + myLib);
    
    System.out.println(myMovie.equals(newMovie));
  }
}