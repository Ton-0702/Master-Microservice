package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {

    private String statusCode; // response status code like 200, 404

    private String statusMsg; // response status message like OK, NOT FOUND

}
