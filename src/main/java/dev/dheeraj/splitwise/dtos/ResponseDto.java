package dev.dheeraj.splitwise.dtos;

import dev.dheeraj.splitwise.enums.Status;
import lombok.Data;

@Data
public class ResponseDto {
    private Status status;
    private int statusCode;
}
