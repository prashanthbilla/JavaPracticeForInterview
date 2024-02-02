package com.user;

import ch.qos.logback.classic.net.SyslogAppender;

import java.util.*;
import java.util.stream.Collectors;

public class Java8FeaturesPractice {

    public static void main(String[] args) {
        System.out.println("Main method executing...in Java8FeaturesPractice Class");
        System.out.println("------------------------------------------------------");
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1, "Prashanth1", "Hyd", 45000);
        Employee employee2 = new Employee(2, "Prashanth2", "Bang", 55000);
        Employee employee3 = new Employee(3, "Prashanth3", "Chennai", 45000);
        Employee employee4 = new Employee(4, "Prashanth4", "Mumbai", 60000);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 7);
        //simpleListPrintingInCollections(list);
        //evenAndOddUsingStreams1(list);
        evenAndOddUsingStreams2(list);
        //employeeOperations(employeeList);
    }

    public static void simpleListPrintingInCollections(List<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
        System.out.println(list);
    }

    public static void evenAndOddUsingStreams1(List<Integer> list) {

        Map<Boolean, List<Integer>> response = list
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(response);
    }

    public static void evenAndOddUsingStreams2(List<Integer> list) {

        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> even = list.stream().filter(n -> n % 2 == 0).toList();
        list.forEach((n) -> {
            System.out.print(n + " ");
        });
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        List<Integer> integerList = list.stream().distinct().toList();
        System.out.println(integerList);
    }

    public static void employeeOperations(List<Employee> employeeList) {
        //employeeList.stream().forEach((e)->System.out.println(e));
        List<Employee> results = employeeList.stream().filter((e) -> (e.getSalary() > 50000) && (e.getSalary() < 60000)).toList();
        System.out.println(results);
        List<Boolean> results1 = employeeList.stream().map(e -> (e.getName().toLowerCase().startsWith("pra"))).collect(Collectors.toList());
        System.out.println(results1);
        Boolean bool = employeeList.stream().anyMatch(e -> Objects.equals(e.getName(), "Prashanth134"));
        System.out.println(bool);
    }

}
