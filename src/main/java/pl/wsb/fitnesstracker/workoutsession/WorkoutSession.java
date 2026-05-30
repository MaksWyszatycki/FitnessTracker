package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import pl.wsb.fitnesstracker.training.api.Training;
import java.time.LocalDateTime;

@Entity
@Table(name = "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    private LocalDateTime timestamp;

    private double latitude;
    private double longitude;
    private double altitude;

    public WorkoutSession(Training training, LocalDateTime timestamp, double latitude, double longitude, double altitude) {
        this.training = training;
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
}