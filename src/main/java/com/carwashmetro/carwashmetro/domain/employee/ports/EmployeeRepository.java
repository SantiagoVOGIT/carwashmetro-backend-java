package com.carwashmetro.carwashmetro.domain.employee.ports;

import com.carwashmetro.carwashmetro.domain.employee.Employee;
import com.carwashmetro.carwashmetro.domain.employee.value_objects.EmployeeId;

public interface EmployeeRepository {

    void save(Employee employee);

    Employee findById(EmployeeId employeeId);

}
