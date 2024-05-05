package com.example.ese15.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "description")
    private String description;
    @Column(nullable = false, name = "from_airport")
    private String fromAirport;
    @Column(nullable = false, name = "to_airport")
    private String toAirport;

    private FlightStatus status;
}

