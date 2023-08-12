package com.workintech.main;

import com.workintech.models.Employee.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Employee> employees = new LinkedList<>();

        Employee emp1 = new Employee(1,"Ahmet","Yılmaz");
        Employee emp2 = new Employee(2,"Mehmet" ,"Kara");
        Employee emp3 = new Employee(1,"Ahmet","Yılmaz");
        Employee emp4 = new Employee(1,"İzel","Ercan");
        Employee emp5 = new Employee(5,"İbrahim","Tatlıses");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        LinkedList<Employee> duplicateEmployees = new LinkedList<>();
        HashMap<Integer,Employee> uniqueEmployeeMap = new HashMap<>();

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(uniqueEmployeeMap.containsKey(employee.getId())) {
                duplicateEmployees.add(employee);
                iterator.remove();
            }else {
                uniqueEmployeeMap.put(employee.getId(),employee);
            }
        }

        System.out.println("Tekrar eden Employee'ler: ");
        for (Employee duplicateEmployee : duplicateEmployees) {
            System.out.println(duplicateEmployee.getFullName());
        }

        System.out.println("\nBenzersiz Employee'ler: ");
        for (Employee uniqueEmployee : uniqueEmployeeMap.values()) {
            System.out.println(uniqueEmployee.getFullName());
        }

    }
}