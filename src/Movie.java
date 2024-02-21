public class Movie {
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private double lengthInMintes;
    private String genre;

    public Movie(String title, String director, int yearCreated, boolean isInColor, double lengthInMintes, String genre) {

        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMintes = lengthInMintes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public double getLengthInMintes() {
        return lengthInMintes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Title: " + getTitle() +
                ", Director: " + getDirector() +
                ", Year: " + getYearCreated() +
                ", Color: " + (getIsInColor() ? "Yes" : "No") +
                ", Length: " + getLengthInMintes() + " minutes" +
                ", Genre: " + getGenre();

    }
}