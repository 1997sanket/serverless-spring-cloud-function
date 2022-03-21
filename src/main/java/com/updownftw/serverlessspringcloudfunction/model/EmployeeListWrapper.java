package com.updownftw.serverlessspringcloudfunction.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeListWrapper {

    private List<Employee> employees;
}
