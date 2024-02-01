package com.example.crud;

import java.util.List;

public interface EmployeeService {
    Empl1 saveEmployee(Empl1 employee);

    List<Empl1> fetchAllEmployees();

    Empl1 getEmployeeById(Integer id);



    Empl1 updateEmployeeById(Integer id, Empl1 employee);



    String deleteDepartmentById(Integer id);
}

