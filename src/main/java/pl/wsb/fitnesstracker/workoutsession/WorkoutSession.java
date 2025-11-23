package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "workout_session")
public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int trainingId;
    private String timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
}
