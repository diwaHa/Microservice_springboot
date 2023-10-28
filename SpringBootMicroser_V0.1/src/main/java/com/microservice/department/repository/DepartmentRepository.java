package com.microservice.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long id);

}
