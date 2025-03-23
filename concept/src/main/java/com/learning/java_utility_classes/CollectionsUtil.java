package com.learning.java_utility_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
 
    List<Integer> arr =  new ArrayList<>(Arrays.asList(100, 12, 33, 41, 55));
    
   

    public void sortingArray() {
        Collections.sort(arr);
        printArray();
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr.toArray()));
    }


    public static void main(String[] args) {
        CollectionsUtil au = new CollectionsUtil();
        au.sortingArray();
    }
}
