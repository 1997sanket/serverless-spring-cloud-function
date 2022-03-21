package com.updownftw.serverlessspringcloudfunction.restfunctions;

import java.util.function.Function;

import com.updownftw.serverlessspringcloudfunction.model.Employee;

public class GetEmployeeById implements Function<Integer, Employee> {

    @Override
    public Employee apply(Integer t) {
        // TODO Auto-generated method stub
        return new Employee(1, "Sanket", "Java Developer");
    }

}
