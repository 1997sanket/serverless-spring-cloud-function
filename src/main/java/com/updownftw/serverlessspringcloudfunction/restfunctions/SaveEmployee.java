package com.updownftw.serverlessspringcloudfunction.restfunctions;

import java.util.function.Function;

import com.updownftw.serverlessspringcloudfunction.model.Employee;

public class SaveEmployee implements Function<Employee, Employee> {

    @Override
    public Employee apply(Employee t) {
        // TODO Auto-generated method stub
        System.out.println("Employee successfully saved");
        return t;
    }

}
