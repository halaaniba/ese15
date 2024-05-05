package com.example.ese15.repository;

import com.example.ese15.entities.Flight;
import com.example.ese15.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByStatus(FlightStatus status);

    List<Flight> findByStatusIn(List<FlightStatus> statuses);
}
