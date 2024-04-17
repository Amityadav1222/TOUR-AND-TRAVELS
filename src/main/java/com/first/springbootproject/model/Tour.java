package com.first.springbootproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    // Other fields, getters, and setters

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tour")
    private List<Booking> bookings;

    public void setPlace(String place) {
    }

}

