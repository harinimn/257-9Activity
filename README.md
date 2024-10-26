# MediaLibrary

This Java-based media library system manages books, movies, and songs, allowing users to add, display, and modify media items, while tracking the library owner and total entries.

## Overview

The project is organized into several main classes:

1. **Book**: Represents a book with properties like title, author, and rating. It allows updating the rating and comparing books.
2. **Movie**: Represents a movie with title, duration, and rating. It provides methods for adjusting the rating and comparing movies.
3. **Song**: Represents a song with title and rating, allowing for rating adjustments and song comparisons.
4. **MediaLib**: The main library class for storing a book, a movie, and a song. It tracks the library owner, entry count, and provides methods to add media items.
5. **MediaLibDate**: Retrieves the current date and time for date-stamping entries.
6. **MediaLibRunner**: Runs the program, adding media items, modifying entries, and displaying the library.
7. **MediaLibRunnerStatic**: Tests static methods in `MediaLib`, such as changing the library owner and viewing the total number of entries.

## Key Features

- **Static and Instance Methods**: Includes static methods to get or change the library owner and check total entries.
- **Rating Adjustments**: Books, movies, and songs have adjustable ratings, capped between 0 and 10.
- **Equality Checks**: Books, movies, and songs can be compared based on title, author (for books), and duration (for movies).
- **Date Tracking**: `MediaLibDate` allows entries to be time-stamped for record-keeping.

## Example Output

- "Welcome to your Media Library" 
- Library owner: Alice
- Adding book The Hobbit
- Adding movie Inception
- Adding song Bohemian Rhapsody
- Total entries: 3
