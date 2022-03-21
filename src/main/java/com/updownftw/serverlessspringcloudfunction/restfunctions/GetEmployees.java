package com.updownftw.serverlessspringcloudfunction.restfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.updownftw.serverlessspringcloudfunction.model.Employee;
import com.updownftw.serverlessspringcloudfunction.model.EmployeeListWrapper;

public class GetEmployees implements Supplier<EmployeeListWrapper> {

    @Override
    public EmployeeListWrapper get() {
        // TODO Auto-generated method stub

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Sanket", "Java Developer"));
        employees.add(new Employee(2, "Ashok", "Doctor"));
        employees.add(new Employee(3, "Martin", "Developer"));

        return new EmployeeListWrapper(employees);
    }

}
