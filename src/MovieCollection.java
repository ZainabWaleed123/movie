public class MovieCollection {
    private Movie[] movieList;

    private int count;

    public MovieCollection(int size) {
        this.movieList = new Movie[size];
        this.count = 0;


    }
    public void addMovie(String title, String director,int yearCreated, boolean isInColor,
                         int lengthInMinutes, String genre)
    {
        if (count < movieList.length) {
            movieList[count++] = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        } else {
            System.out.println("Movie collection is full. Cannot add more movies.");
        }
    }

    public void printCollection(){
        for (Movie movie : movieList) {
            if (movie != null) {
                System.out.println(movie);
            }
        }

    }
}
