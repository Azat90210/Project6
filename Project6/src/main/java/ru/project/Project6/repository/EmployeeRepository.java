package ru.project.Project6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.Project6.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
