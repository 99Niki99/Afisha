package Afisha.reviews.Resourse;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "events")
public class Event {

    @Id
    private Long id;
    private String eventName;
    private LocalDateTime eventDate;
}
