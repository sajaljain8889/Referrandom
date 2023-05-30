package com.example.referandom.repositories;

import com.example.referandom.entities.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
