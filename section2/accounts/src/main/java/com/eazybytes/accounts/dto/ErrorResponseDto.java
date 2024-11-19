package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath; // what api path failed
    private HttpStatus errorCode; // why application fail
    private String errorMessage; // error message
    private LocalDateTime errorTime; // error time
}
