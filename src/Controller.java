import java.util.ArrayList;

public class Controller {

    ArrayList<Movie> movieList = new ArrayList<Movie>();

    public ArrayList<Movie> addMovie(String title, String director, int yearCreated, boolean isInColor,
                                     int lengthInMinutes, String genre) {
        movieList.add(new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre));
        return movieList;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
}

