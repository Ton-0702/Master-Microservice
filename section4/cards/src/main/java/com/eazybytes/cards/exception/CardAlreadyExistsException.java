package com.eazybytes.cards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST) // return status 400: Bad Request
public class CardAlreadyExistsException extends RuntimeException{

    public CardAlreadyExistsException(String message) {
        super(message);
    }
}
