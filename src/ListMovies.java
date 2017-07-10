import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/7/2017.
 */
public class ListMovies {
    public static void main(String[] args) {
        Movie movie1 = new Movie("animated", "Moana");
        Movie movie2 = new Movie("animated", "Frozen");
        Movie movie3 = new Movie("animated", "Toy Story");
        Movie movie4 = new Movie("drama", "Citizen Kane");
        Movie movie5 = new Movie("drama", "Casablanca");
        Movie movie6 = new Movie("drama", "The Godfather");
        Movie movie7 = new Movie("Horror", "Jaws");
        Movie movie8 = new Movie("Horror", "Psycho");
        Movie movie9 = new Movie("Scifi", "2001: A Space Odyssey");
        Movie movie10 = new Movie("Scifi", "The Clockwork Orange");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);

        Scanner scan = new Scanner(System.in);
        String cont = "y";

//        System.out.println(movies.toString());
        System.out.println("There are 10 movies in this list");
        while (cont.equalsIgnoreCase("y")) {
            System.out.println("What category are you interested in? (animated, drama, horror, scifi)");
            String userCategory = scan.nextLine();
            if (userCategory.equalsIgnoreCase(movie2.getCategory())) {
                System.out.println(movie1.getTitle() + "\n" + movie2.getTitle() + "\n" + movie3.getTitle());
            } else if (userCategory.equalsIgnoreCase(movie4.getCategory())) {
                System.out.println(movie4.getTitle() + "\n" + movie5.getTitle() + "\n" + movie6.getTitle());
            } else if (userCategory.equalsIgnoreCase(movie7.getCategory())) {
                System.out.println(movie7.getTitle() + "\n" + movie8.getTitle());
            } else if (userCategory.equalsIgnoreCase(movie9.getCategory())) {
                System.out.println(movie9.getTitle() + "\n" + movie10.getTitle());
            }
            System.out.println();
            System.out.println("Continue? y/n");
            cont = scan.nextLine();
            while (!(cont.equalsIgnoreCase("y"))) {
                if (!(cont.equalsIgnoreCase("y")) && (!(cont.equalsIgnoreCase("n")))) {
                    System.out.println("Invalid answer. Please press y/n");
                    cont = scan.nextLine();
                }
            }
        }
        System.out.println("Goodbye");
    }



}
