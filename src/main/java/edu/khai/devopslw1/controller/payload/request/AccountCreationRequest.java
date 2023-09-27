package edu.khai.devopslw1.controller.payload.request;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Jacksonized
@Builder
public class AccountCreationRequest {
    String email;
}
