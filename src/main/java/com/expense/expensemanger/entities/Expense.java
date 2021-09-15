package com.expense.expensemanger.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Expense {
    @Id
    @SequenceGenerator(
            name = "Income_secuence",
            sequenceName = "Income_secuence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Income_secuence"
    )
    private Long id;
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Transaction> transactions;
    private String businessName;
}
