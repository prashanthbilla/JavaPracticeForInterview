package com.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<Employee> list = new ArrayList<Employee>();

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> test() {
        Employee employee = new Employee(1, "Prashanth", "Hyd",23000);
        Employee employee1 = new Employee(2, "Praveen", "Bang", 40000);
        list.add(employee);
        list.add(employee1);
        return list;
    }

    @PostMapping(value = "/post", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> post(@RequestBody Employee employee) {
        list.add(employee);
        return list;

    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> delete(@PathVariable("id") int id) {
           list.remove(id-1);
        return list;
    }
}
