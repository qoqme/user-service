package com.df.userservice;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "text_notification")
    private String notificationText;

    @Column(name = "date_time_creation")
    private LocalDateTime createdAt;


}