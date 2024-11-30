package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^&|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;


    private String loanNumber;


    private String loanType;


    private int totalLoan;


    private int amountPaid;


    private int outstandingAmount;
}
