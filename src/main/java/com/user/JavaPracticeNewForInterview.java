package com.user;

import lombok.Data;

import java.util.*;

@Data
public class JavaPracticeNewForInterview {

    public static void main(String[] args) {
        System.out.println("Main method executing...");
        System.out.println("------------------------");
        // stringReverse("liril");
        // frequencyOfOccurrence("Prashanth");
        // smallAndCapitalBasedOnEvenAndOddIndex("Prashanth");
        //arraySortingAscendingOrderWithoutCollectionsWithinTheArray();
        // arraySortingDescendingOrderWithoutCollectionsWithinTheArray();
        //arraySortingWithCollectionsAscending();
        //arraySortingWithCollectionsDescending();
        //reverseOfTheArrayUsingCollections();
        //reverseOfTheArrayWithoutCollections();
        //removeDuplicatesFromArrayWithCollections();
        //removeDuplicatesFromListUsingSet();
        //smallAndCapitalBasedOnEvenAndOddIndexWithAscii("prashanth");
        //stringPalindromeWordsInSentence();
        //stringSentencePalindrome();
        factorialOfNumber(6);
    }

    public static void stringReverse(String string) {
        System.out.println("Input String is : " + string);
        String str = string.toLowerCase();
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println("Reverse of the String : " + rev);
        if (string.contentEquals(rev)) {
            System.out.println("is Palindrome : YES");
        } else {
            System.out.println("is Palindrome : NO");
        }
    }

    public static void frequencyOfOccurrence(String string) {
        Map<Character, Integer> map = new HashMap<>();
        System.out.println("Input String is : " + string);
        String str = string.toLowerCase();
        String temp = "";
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                map.put(str.charAt(i), count);
            }
            count = 0;
        }
        System.out.println("Char count in map : " + map);
        for (Character ch : map.keySet()) {
            System.out.println("Char " + ch + " count : " + map.get(ch));
        }

    }

    public static void smallAndCapitalBasedOnEvenAndOddIndex(String string) {
        System.out.println("Input String is : " + string);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= string.length() - 1; i++) {
            if ((i % 2) == 0) {
                temp.append(Character.toUpperCase(string.charAt(i)));
            } else {
                temp.append(Character.toLowerCase(string.charAt(i)));
            }
        }
        System.out.println("Output is : " + temp);
    }

    public static void smallAndCapitalBasedOnEvenAndOddIndexWithAscii(String string) {
        System.out.println("Input String is : " + string);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= string.length() - 1; i++) {
            int ascii = string.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                char outChar;
                if ((i % 2) == 0) {
                    outChar = (char) ascii;
                } else {
                    outChar = (char) (ascii + 32);
                }
                temp.append(outChar);
            } else if (ascii >= 97 && ascii <= 122) {
                char outChar;
                if ((i % 2) == 0) {
                    outChar = (char) (ascii - 32);
                } else {
                    outChar = (char) ascii;
                }
                temp.append(outChar);
            }
        }
        System.out.println("Required Output is : " + temp);
    }


    public static void reverseOfTheArrayWithoutCollections() {
        int[] arr = {4, 3, 1, 2, 7, 10};
        System.out.println("Input Array : " + Arrays.toString(arr));
        int length = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (length > i) {
                int temp = arr[i];
                arr[i] = arr[length - 1];
                arr[length - 1] = temp;
                length--;
            }
        }
        System.out.println("Output Array : " + Arrays.toString(arr));
    }

    public static void arraySortingAscendingOrderWithoutCollectionsWithinTheArray() {
        int[] arr = {4, 3, 1, 2, 1, 2};
        System.out.println("Input Array : " + Arrays.toString(arr));
        int count = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[count] > arr[j]) {
                    int temp = arr[count];
                    arr[count] = arr[j];
                    arr[j] = temp;
                }
                count++;
            }
            count = 0;
            length = length - 1;
        }
       /*
        for (int in : arr) {
            System.out.print(in+" ");
        }
        */
        System.out.print("Output Array : " + Arrays.toString(arr));
        System.out.println(" ");
    }

    public static void arraySortingDescendingOrderWithoutCollectionsWithinTheArray() {
        int[] arr = {4, 3, 1, 2, 1, 2};
        System.out.println("Input Array : " + Arrays.toString(arr));
        int count = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[count] < arr[j]) {
                    int temp = arr[count];
                    arr[count] = arr[j];
                    arr[j] = temp;
                }
                count++;
            }
            count = 0;
            length = length - 1;
        }
        /*
        for (int in : arr) {
            System.out.print(in+" ");
        }
        */
        System.out.print("Output Array : " + Arrays.toString(arr));
        System.out.println(" ");
    }

    public static void arraySortingWithCollectionsAscending() {
        int[] arr = {4, 3, 1, 2, 1, 2};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println("Input List : " + list);
        Collections.sort(list);
        System.out.println("Output Ascending List : " + list);
    }

    public static void arraySortingWithCollectionsDescending() {
        int[] arr = {4, 3, 1, 2, 1, 2};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println("Input List : " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("Output Descending List : " + list);
    }

    public static void reverseOfTheArrayUsingCollections() {
        int[] arr = {4, 3, 1, 2};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println("Input List : " + list);
        Collections.reverse(list);
        System.out.println("Output Reverse List : " + list);
    }

    public static void removeDuplicatesFromArrayWithCollections() {
        int[] arr = {4, 3, 1, 2, 1, 2, 10, 20, 30, 10};
        System.out.println("Input Array : " + Arrays.toString(arr));
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int j : arr) {
            if (!uniqueList.contains(j)) {
                uniqueList.add(j);
            } else {
                duplicateList.add(j);
            }
        }
        System.out.println("Unique Elements List :" + uniqueList);
        System.out.println("Duplicate Elements List :" + duplicateList);
    }

    public static void removeDuplicatesFromListUsingSet() {
        int[] arr = {4, 3, 1, 2, 4, 6, 2, 3, 4, 6, 7, 8, 1, 2, 10};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println("Input List : " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Output Unique Elements List : " + set);
    }

    public static void stringPalindromeWordsInSentence() {
        String sentence = "This is the java program Madam";
        System.out.println("Input Sentence : " + sentence);
        String sentenceLower = sentence.toLowerCase();
        String[] sentenceArray = sentenceLower.split(" ");
        StringBuilder tempSentence = new StringBuilder();
        for (String eachWord : sentenceArray) {
            StringBuilder tempWord = new StringBuilder();
            for (int i = eachWord.length() - 1; i >= 0; i--) {
                char tempChar = eachWord.charAt(i);
                tempWord.append(tempChar);
            }
            if (eachWord.contentEquals(tempWord)) {
                System.out.println(eachWord + " isPalindrome : YES");
            } else {
                System.out.println(eachWord + " isPalindrome : NO");
            }
            tempSentence.append(tempWord).append(" ");
        }
        System.out.println("Final Output Sentence : " + tempSentence);
        //System.out.println("Output Sentence : " + tempSentence.toString().replaceAll("\\s", ""));
    }

    public static void stringSentencePalindrome() {
        String sentence = "this is this";
        System.out.println("Input Sentence : " + sentence);
        String sentenceLower = sentence.toLowerCase();
        String[] sentenceArray = sentenceLower.split(" ");
        StringBuilder tempSentence = new StringBuilder();
        for (int i = sentenceArray.length - 1; i >= 0; i--) {
            String eachWord = sentenceArray[i];
            if (i == 0) {
                tempSentence.append(eachWord);
            } else {
                tempSentence.append(eachWord).append(" ");
            }
        }
        if (sentenceLower.contentEquals(tempSentence)) {
            System.out.println("isPalindrome : YES");
        } else {
            System.out.println("isPalindrome : NO");
        }
        System.out.println("Final Output Sentence : " + tempSentence);
    }

    public static void factorialOfNumber(int number) {
        System.out.println("Input Number : " + number);
        int fact = 1;
        for (int factorialMinusOne = 1; factorialMinusOne <= number; factorialMinusOne++) {
            fact = fact * factorialMinusOne;
        }
        System.out.println("Output Factorial : " + fact);
    }
}
