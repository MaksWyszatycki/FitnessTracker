package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime startDate;
    private String location;

    public Event(String name, java.time.LocalDate startDate, String location) {
        this.name = name;
        this.startDate = startDate.atStartOfDay();
        this.location = location;
    }

}