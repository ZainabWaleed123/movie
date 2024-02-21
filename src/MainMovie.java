import java.util.*;
public class MainMovie {
    public static void main(String[] args) {
        int choice =0;
        int i = 0;

        Controller controller = new Controller();

        Scanner input = new Scanner(System.in);

        System.out.println("Velkommen til min filmsamling!");
        System.out.println("1. Oprat en film");
        System.out.println("2. Afslut");
        choice = input.nextInt();


        while (choice == 1) {
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
            controller.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
            i++;
            System.out.println("1. Oprat en film");
            System.out.println("2. Afslut");

            choice = input.nextInt();
        }

        for (Movie movie : controller.getMovieList()) {
            System.out.println(movie);
        }

        input.close();
    }

    }


