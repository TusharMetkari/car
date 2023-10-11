package com.example.Car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Car.Entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}

