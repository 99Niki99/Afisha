package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Rating Data Table
 */

@Getter
@Setter
@Entity(name = "ratingsDataTable")
public class Rating {

    @Id
    private Long id;
    private String ratingType; // Например, "good", "bad", "skip"
    private String sourceName;
    private String sourceType; // Например, "test", "demo", "prod"

}
