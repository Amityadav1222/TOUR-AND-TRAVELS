package com.first.springbootproject.service;

import com.first.springbootproject.dto.TourDto;
import com.first.springbootproject.dto.UserDto;
import com.first.springbootproject.model.Tour;
import com.first.springbootproject.repo.TourRepository;
import com.first.springbootproject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    TourRepository tourRepository;
    public Tour createTour(TourDto tourDto) {
        Tour tour = new Tour();
        tour.setName(tourDto.getName());
        tour.setDescription(tourDto.getDescription());
        tour.setPlace(tourDto.getPlace());
        return tourRepository.save(tour);
    }

    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }
}
