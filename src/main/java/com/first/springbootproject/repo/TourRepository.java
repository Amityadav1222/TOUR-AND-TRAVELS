package com.first.springbootproject.repo;

import com.first.springbootproject.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour,Long> {
    // Custom queries if needed
}

