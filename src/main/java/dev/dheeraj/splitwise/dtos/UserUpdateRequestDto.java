package dev.dheeraj.splitwise.dtos;

import lombok.Data;

@Data
public class UserUpdateRequestDto {
    private int id;
    private String name;
    private String email;
    private String password;
}
