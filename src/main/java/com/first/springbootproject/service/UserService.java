package com.first.springbootproject.service;

import com.first.springbootproject.dto.UserDto;
import com.first.springbootproject.model.User;
import com.first.springbootproject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User register(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getName());
        user.setEmail(userDto.getEmail());
        return userRepository.save(user);
    }
}
