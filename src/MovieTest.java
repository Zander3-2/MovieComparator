import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class MovieTest {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Harry potter", "Fantasy",2001 ));
        movieList.add(new Movie("Titanic", "Romance", 1997 ));
        movieList.add(new Movie("Hunger games", "Action", 2012));
        movieList.add(new Movie("Sinister", "Horror", 2015));
        movieList.add(new Movie("Descendants", "Adventure", 2023));

        System.out.println("Original List");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieTitleComparator());
        System.out.println("Sorted by Title:");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieGenreComparator());
        System.out.println("Sorted by Genre:");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieYearComparator());
        System.out.println("Sorted by Year");
        System.out.println(movieList);
        System.out.println();
    }

}
