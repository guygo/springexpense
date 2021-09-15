package com.expense.expensemanger.services;

import com.expense.expensemanger.entities.AccountUser;
import com.expense.expensemanger.repository.AccountUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class AccountUserService implements UserDetailsService {

    private final AccountUserRepo userRepo;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    public boolean saveUser(AccountUser user) throws Exception{
        var aUser= userRepo.findUserByEmail(user.email);
        if(aUser!=null){
                throw new Exception("user already exist");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return true;
    }
    public void updatedUser(AccountUser user) throws Exception{
        var aUser= userRepo.findUserByEmail(user.email);
        aUser.email=user.email;
        aUser.name=user.name;
        aUser.password=user.password;
        userRepo.save(aUser);
    }
}
