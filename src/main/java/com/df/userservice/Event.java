package com.df.userservice;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "event_title")
    private String eventTitle;
    private String description;
    @Column(name = "date_start")
    private LocalDateTime startDate;
    @Column(name = "date_end")
    private LocalDateTime endDate;

}
