import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class flashcard {
    String title;
    String description;
    int proficiency;
    Date lastTested;

    public flashcard(String title, String description, int locationOnStack,
            Date lastTested) {
        this.title = title;
        this.description = description;
        this.proficiency = locationOnStack;
        this.lastTested = lastTested;

        // TODO : Create a function to add the card to the default locaiton on a
        // flashset
    }

    public boolean hasCorrectTitle(List<String> options, int indexOfCorrect, Scanner sc) {
        System.out.println(this.description + " describes which term?");

        for (int x = 0; x > options.size(); x++) {
            System.out.println(x + 1 + ":" + options.get(x));
        }

        // TODO : create a function to validate the input
        int selection = sc.nextInt();
        if (selection == indexOfCorrect) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasCorrectDescription(List<String> options, int indexOfCorrect, Scanner sc) {
        System.out.println(this.title + " is described as which of the following?");

        for (int x = 0; x > options.size(); x++) {
            System.out.println(x + 1 + ":" + options.get(x));
        }

        int selection = sc.nextInt();
        if (selection == indexOfCorrect) {
            return true;
        } else {
            return false;
        }
    }
}
