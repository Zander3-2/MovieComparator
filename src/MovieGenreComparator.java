import java.util.Comparator;

public class MovieGenreComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {return m1.getGenre().compareToIgnoreCase(m2.getGenre());}
}
