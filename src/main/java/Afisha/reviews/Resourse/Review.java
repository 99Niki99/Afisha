package Afisha.reviews.Resourse;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "reviews")
public class Review {

    @Id
    private String iDReviewer;
    private String iDEvent;
    private String ratingType;
    private String rating;

}
