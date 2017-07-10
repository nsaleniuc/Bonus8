import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/7/2017.
 */
public class Movie {

    public Movie(String category, String title) {
        this.category = category;
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + " " + category + "\n";
    }

    private String category;
    private String title;
}




