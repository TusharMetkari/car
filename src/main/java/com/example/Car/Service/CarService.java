package com.example.Car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.Entity.Car;
import com.example.Car.Repository.CarRepository;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
    
    public Car createCar(Car car) {
        return carRepository.save(car);
    }
    
    public Car updateCar(Long id, Car car) {
        if (carRepository.existsById(id)) {
            car.setId(id);
            return carRepository.save(car);
        }
        return null;
    }
    
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}

