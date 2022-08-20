package dev.dheeraj.splitwise.controllers;

import dev.dheeraj.splitwise.dtos.UserCreateRequestDto;
import dev.dheeraj.splitwise.dtos.UserCreateResponseDto;
import dev.dheeraj.splitwise.dtos.UserUpdateRequestDto;
import dev.dheeraj.splitwise.dtos.UserUpdateResponseDto;
import dev.dheeraj.splitwise.enums.Status;
import dev.dheeraj.splitwise.models.User;
import dev.dheeraj.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    public UserCreateResponseDto createUser(UserCreateRequestDto requestDto){
        User user = new User();
        user.setName(requestDto.getName());
        user.setEmail(requestDto.getEmail());
        user.setHashedPassword("Hashed" + requestDto.getPassword());
        User userResponse = userService.createUser(user);

        UserCreateResponseDto userCreateResponseDto = new UserCreateResponseDto();

        userCreateResponseDto.setId(userResponse.getId());
        userCreateResponseDto.setStatus(Status.SUCCESS);
        userCreateResponseDto.setStatusCode(200);

        return userCreateResponseDto;
    }

    public UserUpdateResponseDto updateUser(UserUpdateRequestDto requestDto){
        User user = new User();
        user.setId(requestDto.getId());
        user.setName(requestDto.getName());
        user.setEmail(requestDto.getEmail());
        user.setHashedPassword("Hashed" + requestDto.getPassword());

        User userResponse = userService.updateUser(user);

        UserUpdateResponseDto userUpdateResponseDto = new UserUpdateResponseDto();
        userUpdateResponseDto.setStatus(Status.SUCCESS);
        userUpdateResponseDto.setStatusCode(200);
        return userUpdateResponseDto;
    }




}
