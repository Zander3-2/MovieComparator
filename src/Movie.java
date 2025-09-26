//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Movie {
private String title;
private String genre;
private int releaseYear;

public Movie(String title, String genre, int releaseYear){
    this.title = title;
    this.genre = genre;
    this.releaseYear = releaseYear;
}
public String getTitle(){return title;}
public String getGenre(){return genre;}
public int getReleaseYear(){return releaseYear;}

@Override
public String toString(){
    return title + genre + releaseYear;
}
    }

