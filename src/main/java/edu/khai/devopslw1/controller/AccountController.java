package edu.khai.devopslw1.controller;

import edu.khai.devopslw1.controller.payload.request.AccountCreationRequest;
import edu.khai.devopslw1.controller.service.AccountService;
import edu.khai.devopslw1.controller.service.repository.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    @ResponseBody
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public Long createNewAccount(@RequestBody AccountCreationRequest accountCreationRequest){
        return accountService.createNewAccount(accountCreationRequest);
    }

}
