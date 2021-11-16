package com.revature;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    // make id the primary key:
    @Id
    private int id;
    private String name;
    private String email;

    // constructors:
    public Employee() { }

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // setters and getters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
