package com.example.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;


// declaring an inteface extending from JPAREpoistory to get free spring boot
// functionality: CRUD operations: create, read, update, delete and a feature
//  that attempts to recognize and implement the query based on the method name
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}