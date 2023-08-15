package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *  Review Data table
 */

@Getter
@Setter
@Entity(name = "reviewsDataTable")
public class Review {

    @Id
    private String iDReviewer;
    private String iDEvent;
    private String ratingType;
    private String rating;

}
