package com.expense.expensemanger.controllers;


import com.expense.expensemanger.entities.Account;
import com.expense.expensemanger.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;


@RestController
@RequestMapping(path="api/v1/account")
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account newaccount) {
        Account account = accountService.create(newaccount);
        if (account == null) {
           return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>(account, HttpStatus.CREATED);
        }

    }

    @GetMapping
    public Account getAccount(){
        return accountService.getAccount();
    }
}
