package com.first.springbootproject.service;

import com.first.springbootproject.model.Booking;
import com.first.springbootproject.repo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking  createBooking(Booking bookingDto) {

Booking booking = new Booking();
booking.setId(Long.valueOf(bookingDto.getId()));
booking.setBookingName(bookingDto.getBookingName());
booking.setPlace(bookingDto.getPlace());
booking.setAmount(bookingDto.getAmount());
return bookingRepository.save(booking);

    }

public List<Booking> getAllTours() { return bookingRepository.findAll();}



}
