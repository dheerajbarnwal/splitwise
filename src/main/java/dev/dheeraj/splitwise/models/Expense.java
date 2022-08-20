package dev.dheeraj.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
public class Expense extends Base{
    @ManyToOne
    private User createdBy;

    int amount;

    @ManyToMany
    private List<User> participants;
}
