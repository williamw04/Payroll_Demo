package com.example.Payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// @Entity annotation specifies that the class is an entity
// indicating to springboot to make this object ready for storage in
// a JPA-based data store/ is mapped to a database table.

/**
 * Employee domain object representing an employee. with attributes
 * id, name, and role.
 */
@Entity
class Employee {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {}

    Employee(String name, String role) {

        // attributes
        this.name = name;
        this.role = role;
    }

    //getters
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // equals, hashCode, and toString
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}