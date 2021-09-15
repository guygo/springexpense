package com.expense.expensemanger.controllers;

import com.expense.expensemanger.entities.AccountUser;
import com.expense.expensemanger.services.AccountUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class AccountUserController {
    private final AccountUserService accountUserService;
    @PostMapping
    public ResponseEntity<Boolean> addUser(@RequestBody AccountUser body) throws Exception {
       return ResponseEntity.ok().body(accountUserService.saveUser(body));
    }
}
