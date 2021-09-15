package com.expense.expensemanger.entities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountUser {
    @SequenceGenerator(
            name = "account_user_secuence",
            sequenceName = "account_user_secuence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_user_secuence"
    )
    private @Id Long id;
    public String name;
    public String email;
    public String password;

    public AccountUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
