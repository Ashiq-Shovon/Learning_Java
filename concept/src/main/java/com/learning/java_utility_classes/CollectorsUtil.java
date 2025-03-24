package com.learning.java_utility_classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsUtil {

    //max num
    public void maxNum(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer max2 = numbers.stream().max(Comparator.naturalOrder()).get();
        Integer max = numbers.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
        System.out.println(max);
        System.out.println(max2);
    }

    //sum 
    public void sum(){
        List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7);
        int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);
    }

    public static void main(String[] args) {
        CollectorsUtil cu = new CollectorsUtil();
        cu.maxNum();
        cu.sum();
        System.out.println("Hello world!");
    }

}
