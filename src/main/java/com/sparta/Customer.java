package com.sparta;

import java.util.Objects;

public class Customer {
    private String firstName;   // default is null
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object c) {
        Customer c1 = (Customer) c;
        if (this.getFirstName().equals(c1.getFirstName()) && this.getLastName().equals(c1.getLastName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
