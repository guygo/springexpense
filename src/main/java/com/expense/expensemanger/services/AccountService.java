package com.expense.expensemanger.services;

import com.expense.expensemanger.entities.Account;
import com.expense.expensemanger.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class AccountService {
    @Autowired
    AccountRepository repo;

    public Account create(Account acc){
        return repo.save(acc);
    }
    public Account getAccount(){
        return new Account(60.3,60.2,23.5);
    }


}
