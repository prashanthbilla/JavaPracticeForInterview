package com.user;

import java.util.*;

public class New {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);list.add(1);list.add(2);list.add(3);list.add(3);list.add(2);list.add(4);
        System.out.println("Input : "+list);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("Output : "+set);
    }
}
