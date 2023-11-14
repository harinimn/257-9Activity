public class MediaLibRunnerStatic{
  // Step 1
  public static void main(String[] args){
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("Harini");
    // step 8
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.owner = "Deeksha";
    System.out.println(MediaLib.getOwner() + "'s Library");
    // step 14
    System.out.println("Initial number of entries is " + MediaLib.getNumEntries());

    Movie hariniMovie = new Movie("Harry Potter", 2.5);
    MediaLib hariniLibrary = new MediaLib();
    hariniLibrary.addMovie(hariniMovie);
    Book deekshaBook = new Book("Lord of the Rings", "JRR Tolkein");
    MediaLib deekshaLibrary = new MediaLib();
    deekshaLibrary.addBook(deekshaBook);
    //step 17
    System.out.println("Number of entries is " + MediaLib.getNumEntries());

  }
}