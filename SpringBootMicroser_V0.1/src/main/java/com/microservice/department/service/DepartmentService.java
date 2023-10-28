package com.microservice.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department savedepartment(Department department) {
		log.info("save Department of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(Long id) {

		return departmentRepository.findByDepartmentId(id);
	}
}
