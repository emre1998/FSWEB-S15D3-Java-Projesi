package com.workintech.models.Employee;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id,String firstName,String lastName) {
        this.id=id;
        this.firstName= firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}


