package com.first.springbootproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    // Other fields, getters, and setter

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Booking> bookings;


}
