package dev.dheeraj.splitwise.service;

import dev.dheeraj.splitwise.dtos.UserCreateRequestDto;
import dev.dheeraj.splitwise.dtos.UserCreateResponseDto;
import dev.dheeraj.splitwise.models.User;
import dev.dheeraj.splitwise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

}
