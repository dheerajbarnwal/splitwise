package dev.dheeraj.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ExpensePaidUser extends Base {
    @ManyToOne
    private Expense expense;
    private int amount;

    @ManyToOne
    private User user;
}
