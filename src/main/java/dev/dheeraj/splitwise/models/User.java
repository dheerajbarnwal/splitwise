package dev.dheeraj.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends Base{
    private String name;
    private String email;
    private String hashedPassword;
}
