package Afisha.reviews.Resourse;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ratings")
public class Rating {

    @Id
    private Long id;
    private String ratingType; // Например, "good", "bad", "skip"
    private String sourceName;
    private String sourceType; // Например, "test", "demo", "prod"

}
