import java.util.Comparator;

public class MovieYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {return Integer.compare(m1.getReleaseYear(),m2.getReleaseYear());}
}
