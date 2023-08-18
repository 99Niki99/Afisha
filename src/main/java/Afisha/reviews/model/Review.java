package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *  Review Data table
 */

@Getter
@Setter
@Entity(name = "reviewsDataTable")
public class Review {

    @Id
    private String id;

    private String iDEvent;
    private String ratingType;
    private String rating;

}
