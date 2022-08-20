package dev.dheeraj.splitwise.dtos;

import lombok.Data;

@Data
public class UserCreateRequestDto {
    String name;
    String email;
    String password;
}
