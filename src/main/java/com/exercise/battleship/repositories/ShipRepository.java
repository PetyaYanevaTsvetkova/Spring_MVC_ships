package com.exercise.battleship.repositories;

import com.exercise.battleship.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
    Optional<Ship> findByName(String name);
    List<Ship> findByUserId(Long ownerId);
    List<Ship> findByUserIdNot(Long ownerId);
    List<Ship> findByOrderByName();
}
