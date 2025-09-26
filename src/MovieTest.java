import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class MovieTest {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Harry potter ", "Fantasy ",2001 ));
        movieList.add(new Movie("Movie 2 ", "Genre", 2006 ));
        movieList.add(new Movie("Movie 3", "Genre", 2005));
        movieList.add(new Movie("Movie 4", "Genre", 2069));
        movieList.add(new Movie("Movie 5", "Genre ", 2023));

        System.out.println("Original List");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieTitleComparator());
        System.out.println("Sortet by Title:");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieGenreComparator());
        System.out.println("Sortet by Genre:");
        System.out.println(movieList);
        System.out.println();

        Collections.sort(movieList, new MovieYearComparator());
        System.out.println("Sortet by Year");
        System.out.println(movieList);
        System.out.println();
    }

}
