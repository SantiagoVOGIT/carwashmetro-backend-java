package com.carwashmetro.carwashmetro.domain.employee;

import com.carwashmetro.carwashmetro.domain.employee.value_objects.EmployeeId;
import com.carwashmetro.carwashmetro.domain.employee.value_objects.EmployeePosition;
import com.carwashmetro.carwashmetro.domain.employee.value_objects.EmployeeStatus;
import com.carwashmetro.carwashmetro.domain.user.value_objects.UserId;
import shared.domain.CreatedAt;

import java.math.BigDecimal;

public class Employee {

    private EmployeeId id;

    private UserId userId;

    private EmployeePosition position;

    private EmployeeStatus status;

    private BigDecimal salary;

    private CreatedAt createdAt;

}
