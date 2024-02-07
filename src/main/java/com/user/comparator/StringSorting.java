package com.user.comparator;

import com.user.Employee;

import java.util.Comparator;

public class StringSorting implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
