package Afisha.reviews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Event Data Table
 */
@Getter
@Setter
@Entity(name = "eventsDataTable")
public class Event {

    @Id
    private Long id;
    private String eventName;
    private LocalDateTime eventDate;
}
