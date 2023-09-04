package com.tka.collections.EmployeeHotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManagement {

    private Map<String, List<Employee>> employeesMap;

    public HotelManagement() {
        this.employeesMap = new HashMap<>();
        employeesMap.put("FrontDesk", new ArrayList<>());
        employeesMap.put("HouseKeeping", new ArrayList<>());
        employeesMap.put("KitchenStaff", new ArrayList<>());
        employeesMap.put("Maintanance", new ArrayList<>());
    }

    public void hire(String category, int id, String name) throws DuplicateEmployeeException{
        List<Employee> employeesList = employeesMap.get(category);
        for(Employee employee : employeesList) {
            if(employee.getId() == id) {
                throw new DuplicateEmployeeException("Employee already found");
            }
        }

        Employee employee = null;
        switch(category) {
            case "FrontDesk" :
                employee = new FrontDesk(id, name);
                break;
            case "HouseKeeping" :
                employee = new HouseKeeping(id, name);
                break;
            case "KitchenStaff" :
                employee = new KitchenStaff(id, name);
                break;
            case "Maintanance" :
                employee = new Maintanance(id, name);
                break;
            default :
                System.out.println("Invalid Category");
        }

        if(employee!=null) {
            employeesList.add(employee);
            System.out.println("Employee added");
        }
        else {
            System.out.println("Invalid");
        }


    }

    public void assign(String category, int id) throws InvalidTaskAssignmentException {
        List<Employee> employeeList = employeesMap.get(category);
        Employee employee = null;
        for(Employee e : employeeList) {
            if(e.getId() == id) {
                employee= e;
                break;
            }
        }

        if(employee == null) {
            throw new InvalidTaskAssignmentException("Employee not found");
        }
        else {
            employee.work();
        }
    }

    public void show() {
        for(String key : employeesMap.keySet()) {
            System.out.println(key + " : " + employeesMap.get(key));
        }
    }



}
