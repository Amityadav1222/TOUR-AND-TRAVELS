package com.first.springbootproject.repo;

import com.first.springbootproject.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom queries if needed

}
