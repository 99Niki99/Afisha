package Afisha.reviews.model;

        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;

public class JsonSimpleParser {
    public Review parseAndCreateRating(String json) {
        Gson gson = new Gson();
        Review review = gson.fromJson(json, Review.class);
        return review;
    }
}
