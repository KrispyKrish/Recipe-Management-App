
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String author; // User who created the recipe
    private final List<Ingredient> ingredients;
    private String steps;
    private int likes; // Number of likes for the recipe
    private final List<String> comments; // List of comments on the recipe

    // Constructor for Recipe
    public Recipe(String name, String author) {
        this.name = name;
        this.author = author;
        this.ingredients = new ArrayList<>();
        this.steps = "";
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getLikes() {
        return likes;
    }

    public void incrementLikes() {
        likes++;
    }

    // New decrementLikes method
    public void decrementLikes() {
        if (likes > 0) {
            likes--;
        }
    }

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}
