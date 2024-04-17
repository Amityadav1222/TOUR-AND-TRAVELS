package com.first.springbootproject.controller;

import com.first.springbootproject.dto.TourDto;
import com.first.springbootproject.model.Booking;
import com.first.springbootproject.model.Tour;
import com.first.springbootproject.service.BookingService;
import com.first.springbootproject.service.TourService;
import com.first.springbootproject.dto.UserDto;
import com.first.springbootproject.model.User;
import com.first.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rwi")
public class TourController {
    @Autowired
    private TourService tourService;

    @Autowired
    UserService userService;

    @Autowired
    BookingService bookingService;

    @PostMapping("/register")
    public User register(@RequestBody UserDto userDto){
        return userService.register(userDto);
    }


    @GetMapping("/tour")
    public List<Tour> getAllTours() {
        return tourService.getAllTours();
    }
//
    @PostMapping("/addTour")
    public Tour createTour(@RequestBody TourDto tourDto) {
        return tourService.createTour(tourDto);
    }

    @PostMapping("/booking")
    public Booking createBooking(@RequestBody Booking bookingDto) {
        return bookingService.createBooking(bookingDto);
    }

    @GetMapping("/booking")
    public List<Booking> bookings() {
        return (List<Booking>) bookingService.createBooking(new Booking());
    }

//
//    // Other CRUD APIs
//
//    public void setTourService(TourService tourService) {
//        this.tourService = tourService;
//    }
}
