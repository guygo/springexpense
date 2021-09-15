package com.expense.expensemanger.repository;

import com.expense.expensemanger.entities.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountUserRepo extends JpaRepository<AccountUser,Long> {
    @Query("SELECT u FROM AccountUser u WHERE u.email = ?1")
    AccountUser findUserByEmail(String email);
}
