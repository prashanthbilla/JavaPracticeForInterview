package com.user;

import java.util.*;

public class InterviewConcentrix {
    public static void main(String[] args) {

        intArraySortingBasedOnIndex();
        stringArraySoringWithJava8Features();
        stringArraySoringWithoutJava8Features();

    }

    public static void intArraySortingBasedOnIndex() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = 4;
        int[] output = new int[input.length];
        int temp = 0;
        int temp3 = index;
        for (int i = index; i < input.length; i++) {
            output[temp] = input[i];
            temp++;
        }
        for (int i = 0; i < index; i++) {
            output[input.length - temp3] = input[i];
            temp3--;
        }
        System.out.println(Arrays.toString(output));

    }


    public static void stringArraySoringWithJava8Features() {
        String[] strings = {"ba", "ab", "bac", "abc"};
        // output = [ab, ba, abc, bac];
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strings));
    }

    public static void stringArraySoringWithoutJava8Features() {
        String stringInput = "No zno one could disentangle correctly";
        String stringInputLower = stringInput.toLowerCase();
        String[] w = stringInputLower.split(" ");
        for (int i = 0; i < w.length; i++) {
            for (int j = i + 1; j < w.length; j++) {
                String tempI = w[i];
                String tempJ = w[j];
                if ((tempI.length() == tempJ.length()) && ((int) tempI.charAt(0)) > ((int) tempJ.charAt(0))) {
                    w[i] = w[j];
                    w[j] = tempI;
                }
                if (tempJ.length() < tempI.length()) {
                    w[i] = w[j];
                    w[j] = tempI;
                }
            }
        }
        System.out.println(Arrays.toString(w));
    }
}
