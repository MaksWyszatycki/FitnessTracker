package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.*;
import pl.wsb.fitnesstracker.user.api.User;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_event")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private LocalDateTime registrationDate;

    public UserEvent(User user, Event event, LocalDateTime registrationDate) {
        this.user = user;
        this.event = event;
        this.registrationDate = registrationDate;
    }
}