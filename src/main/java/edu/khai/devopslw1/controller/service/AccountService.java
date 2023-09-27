package edu.khai.devopslw1.controller.service;

import edu.khai.devopslw1.controller.payload.request.AccountCreationRequest;
import edu.khai.devopslw1.controller.service.repository.AccountRepository;
import edu.khai.devopslw1.controller.service.repository.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Long createNewAccount(AccountCreationRequest accountCreationRequest) {
        Account newAccount = Account.builder().email(accountCreationRequest.getEmail()).build();
        accountRepository.save(newAccount);
        return newAccount.getId();
    }
}
