package com.EmployeeApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeApp.Entity.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long>// here employee is entity
{

}
