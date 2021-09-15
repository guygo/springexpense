package com.expense.expensemanger.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account{
  @Id
  @SequenceGenerator(
          name = "account_secuence",
          sequenceName = "account_secuence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "account_secuence"
  )
  private Long id;
  public double fund;
  public double expense;
  public double incomes;

    public Account(double fund, double expense, double incomes) {
        this.fund = fund;
        this.expense = expense;
        this.incomes = incomes;
    }
}
