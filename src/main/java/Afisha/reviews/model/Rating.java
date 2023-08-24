package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 * Rating Data Table
 */

@Getter
@Setter
@Entity(name = "ratingsDataTable")
@Data
public class Rating {

    @Id
    private String eventId;
    private String userID;
    private String rate; // Например, "good", "bad", "skip"
    private String sourceName;
    private String sourceType; // Например, "test", "demo", "prod"

}
