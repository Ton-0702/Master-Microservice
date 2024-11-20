package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Concatenate @Controller and @ResponseBody annotations to return JSON
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE}) // produces to return JSON
@AllArgsConstructor
public class AccountsController {

    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccounts(@RequestBody CustomerDto customerDto) {
        iAccountsService.createAccounts(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED) // response to header
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201)); // response body
    }
}
