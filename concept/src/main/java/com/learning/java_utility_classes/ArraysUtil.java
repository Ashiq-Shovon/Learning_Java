package com.learning.java_utility_classes;

import java.util.Arrays;

//use cases of Arrays util class in java
public class ArraysUtil {
    // The Arrays utility class provides essential functions for array manipulation,
    // including:

    // Sorting (sort(), parallelSort())
    // Searching (binarySearch())
    // Copying (copyOf(), copyOfRange())
    // Comparison (equals(), deepEquals())
    // Conversion (toString(), deepToString(), asList())
    // Functional Programming (stream(), spliterator())
    // Hashing (hashCode(), deepHashCode())

    int[] numbers = { 20, 2, 113, 114, 5 };

    // Sorting
    // The Arrays.sort() method sorts the specified array of objects into ascending
    // order, according to the natural ordering of its elements.
    // The Arrays.parallelSort() method sorts the specified array of objects into
    // ascending order, according to the natural ordering of its elements.
    // The Arrays.sort() method uses the quicksort algorithm to sort the array.
    // The Arrays.parallelSort() method uses the fork/join framework to sort the
    // array in parallel.
    // The Arrays.sort() method is faster than the Arrays.parallelSort() method for
    // small arrays.
    // The Arrays.parallelSort() method is faster than the Arrays.sort() method for
    // large arrays.
    // The Arrays.sort() method is a stable sort algorithm.
    // The Arrays.parallelSort() method is not a stable sort algorithm.
    // The Arrays.sort() method is a serial sort algorithm.
    // The Arrays.parallelSort() method is a parallel sort algorithm.
    // The Arrays.sort() method throws a NullPointerException if the specified array
    // is null.
    // The Arrays.parallelSort() method throws a NullPointerException if the
    // specified array is null.
    // The Arrays.sort() method throws an IllegalArgumentException if the specified
    // array contains an element that is not mutually comparable.

    //sorting array
    public void sortingArray() {
        Arrays.sort(numbers);
        print();
    }

    public void parallelSortingArray() {
        Arrays.parallelSort(numbers);
        print();
    }

    //Copying

    public void copyArray(){
        int[] original = {23, 12, 4, 57, 100};
        int[] copy = Arrays.copyOf(original, original.length);
        print(Arrays.toString(copy));
    }

    public void copyArrayRange(){
        int[] original = {34, 21, 107, 89, 56}; 
        int[] copy = Arrays.copyOfRange(original, 2, 4);
        print(Arrays.toString(copy));
    }

    //conversion
    //array to String
    public void arrayToString(int[] numbers) {
       
        print(Arrays.toString(numbers));

    }

    //String to array
    public void stringToArray(String str){
        String[] in = str.split(", ");
        int[] arr = Arrays.stream(in).mapToInt(Integer::parseInt).toArray();
    
        print(Arrays.toString(arr));
    }


    //print
    public void print(){
        System.out.println(Arrays.toString(numbers));
        
    }

    // public <T> void print(T[] value) {
       
    //     System.out.println(Arrays.toString(value));
       
    // }

    public <T> void print(T value) {
       
        System.out.println(value);
       
    }

    public static void main(String[] args) {
        ArraysUtil au = new ArraysUtil();
        au.sortingArray();
        au.parallelSortingArray();

        //convert array to string
        int[] numbers = { 3, -1, -20, 100, 23 };
        au.arrayToString(numbers);

        //convert string to array
        au.stringToArray("3, -1, -20, 100, 23");


        //copy array
        au.copyArray();

        au.copyArrayRange();
    }
}
