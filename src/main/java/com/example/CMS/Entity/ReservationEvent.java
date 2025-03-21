package com.example.CMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservation_event")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservationEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationID")
    private int reservationID;

    @ManyToOne
    @JoinColumn(name = "eventID", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "resourceID", nullable = false)
    private Resource resource;

    @Column(name = "reservationName", length = 100)
    private String reservationName;

    @Column(name = "reservationDate", length = 100)
    private String reservationDate;

    @Column(name = "startTime", length = 100)
    private String startTime;

    @Column(name = "endTime", length = 100)
    private String endTime;

    @Column(name = "capacity", length = 100)
    private Integer capacity;

    @Column(name = "status", length = 100)
    private String status;
}
