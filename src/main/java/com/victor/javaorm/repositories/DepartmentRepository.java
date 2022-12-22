package com.victor.javaorm.repositories;

import com.victor.javaorm.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
