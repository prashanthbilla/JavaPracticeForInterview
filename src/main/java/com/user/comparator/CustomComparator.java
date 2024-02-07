package com.user.comparator;

import com.user.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomComparator implements Comparator<Employee> {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee employee = new Employee(1, "ZPrashanth", "Hyd", 23000);
        Employee employee1 = new Employee(2, "APraveen", "Bang", 40000);
        Employee employee2 = new Employee(3, "Prashanth1", "Del", 50000);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.sort(new CustomComparator());
        System.out.println(list);
        list.sort(new StringSorting());
        System.out.println(list);
      Comparator<Employee> employeeComparator=new Comparator<Employee>() {
          @Override
          public int compare(Employee o1, Employee o2) {
              return (int) (o1.getSalary()- o2.getSalary());
          }
      };
      System.out.println(employeeComparator);
    }
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
