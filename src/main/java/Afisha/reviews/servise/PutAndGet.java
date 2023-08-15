package Afisha.reviews.servise;

import Afisha.reviews.Resourse.Review;

import java.util.ArrayList;

public class PutAndGet {
    public void putData(ArrayList<String> reviewData) {
        Review review = new Review();
        review.setIDEvent(reviewData.get(1));
        review.setIDReviewer(reviewData.get(1));
        review.setRatingType(reviewData.get(2));
        review.setRating(reviewData.get(3));
    }

    public void getData() {
        Review review = new Review();
        review.getIDReviewer();
        review.getIDEvent();
        review.getRatingType();
        review.getRating();
    }
}
