package com.expense.expensemanger.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    public double amount;
    public Date transferDate;
    public Date dayOfTransaction;


}
