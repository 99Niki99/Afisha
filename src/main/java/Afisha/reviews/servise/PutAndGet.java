package Afisha.reviews.servise;

import Afisha.reviews.model.Review;

import java.util.ArrayList;


/**
 * CLass fo make put and get data from DB and send it to Controller
 */

public class PutAndGet {
    public void putData(ArrayList<String> reviewData) {
        Review review = new Review();
        review.setIDEvent(reviewData.get(1));
        review.setId(reviewData.get(1));
        review.setRatingType(reviewData.get(2));
        review.setRating(reviewData.get(3));
    }

    public void getData() {
        Review review = new Review();
        review.getId();
        review.getIDEvent();
        review.getRatingType();
        review.getRating();
    }
}
