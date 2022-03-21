package com.updownftw.serverlessspringcloudfunction.restfunctions;

import java.util.function.Consumer;

public class DeleteEmployeeById implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        // TODO Auto-generated method stub
        System.out.println("Employee with id: " + t + "successfully deleted");
    }

}
