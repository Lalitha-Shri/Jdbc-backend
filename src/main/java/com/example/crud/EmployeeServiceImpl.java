package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
    public class EmployeeServiceImpl implements EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        @Override
        public Empl1 saveEmployee(Empl1 employee) {
            return employeeRepository.save(employee);
        }

        @Override
        public List<Empl1> fetchAllEmployees() {
            List<Empl1> allEmployees = employeeRepository.findAll();
            return allEmployees;
        }


    @Override
        public Empl1 getEmployeeById(Integer id) {
            Optional<Empl1> employee = employeeRepository.findById(id);
            if (employee.isPresent()) {
                return employee.get();
            }
            return null;
        }

    public Empl1 updateEmployeeById(Integer id, Empl1 employee) {
        Optional<Empl1> employee1 = employeeRepository.findById(id);

        if (employee1.isPresent()) {
            Empl1 originalEmployee = employee1.get();

            if (Objects.nonNull(employee.getEname()) && !"".equalsIgnoreCase(employee.getEname())) {
                originalEmployee.setEname(employee.getEname());
            }
            if (Objects.nonNull(employee.getEsalary()) && employee.getEsalary() != 0) {
                originalEmployee.setEsalary(employee.getEsalary());
            }
            return employeeRepository.save(originalEmployee);
        }
        return null;
    }


    @Override
        public String deleteDepartmentById(Integer id) {
            if (employeeRepository.findById(id).isPresent()) {
                employeeRepository.deleteById(id);
                return "Employee deleted successfully";
            }
            return "No such employee in the database";
        }
        }


