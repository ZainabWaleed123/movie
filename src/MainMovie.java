import java.util.Scanner;
public class MainMovie {
    public static void main(String[] args) {
        int size = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size movie" );
        int collectionSize = input.nextInt();
        System.out.println("my movie: " + size);

        MovieCollection movieCollection = new MovieCollection(collectionSize);


        for (int i = 0; i < collectionSize; i++) {
            System.out.println("Enter details for Movie " + (i + 1) + ":");
            System.out.print("Title: ");
            input.nextLine();
            String title = input.nextLine();

            System.out.print("Director: ");
            String director = input.nextLine();


            System.out.print("Year Created: ");
            int yearCreated = input.nextInt();

            input.nextLine();

            System.out.print("Is in Color (true/false): ");
            boolean isInColor = input.nextBoolean();

            System.out.print("Length in Minutes: ");

            int lengthInMinutes = input.nextInt();

            System.out.print("Genre: ");
            String genre = input.next();
            movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        }

        movieCollection.printCollection();
        input.close();
    }

    }


