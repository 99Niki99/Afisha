package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

/**
 * Event Data Table
 */
@Getter
@Setter
@Entity(name = "eventsDataTable")
public class Event {

    @Id
    private String id;

    private String eventName;
    private LocalDateTime eventDate;
}
