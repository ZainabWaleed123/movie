import java.util.ArrayList;
public class MovieCollection {
    Controller controller = new Controller();
    private ArrayList movieList;

    private int count;

    public MovieCollection(ArrayList<Movie> movieList) {
        this.movieList=new ArrayList<>(movieList);


    }

    public void printCollection(){
        for (Movie movie : controller.getMovieList()) {
            if (movie != null) {
                System.out.println(movie);
            }
        }

    }
}
