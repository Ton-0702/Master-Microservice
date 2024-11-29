package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(name = "Cards",
        description = "Schema to hold Card information"
)
public class CardsDto {

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^&|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4354437687"
    )
    private String mobileNumber;

    @Schema(
            description = "Card Number of the customer", example = "100646930341"
    )
    private String cardNumber;

    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    private String cardType;

    @Schema(
            description = "Total amount limit available against a card", example = "100000"
    )
    private int totalLimit;

    @Schema(
            description = "Total amount used by a Customer", example = "1000"
    )
    private int amountUsed;

    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    private int availableAmount;
}
