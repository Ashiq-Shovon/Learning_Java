package com.learning.datatypes.nonprimitive;

import java.util.Arrays;


public class CustomString {



    public void charAt(String val, int index) {
        //The charAt() method returns the character at the specified index in a string.
        //The index of the first character is 0, the second character is 1, and so on.
         print(val.charAt(index));
    }

    public void concat(String val1, String val2) {
        //The concat() method appends one string to the end of another string.
        //It returns a new string that represents the combination of the two strings.
         print(val1.concat(" ").concat(val2));
    }

    public void contains(String val1, String val2) {
        //The contains() method checks whether a string contains a sequence of characters.
        //It returns true if the sequence of characters is found, otherwise, it returns false.
        print(val1.contains(val2));
    }
    //indexOf() method returns the index of the first occurrence of the specified character or substring within a string.
    public void indexOf(String val){
         print(val.indexOf("a"));
    }

    //join() method joins the elements of an array into a single string
    public void join(String[] val){
        print(val);
        print(String.join(" ", val));
    }

    //split() method splits a string into an array of substrings
    public void split(String val){
        String[] rs = val.split(", ");
        print(rs);
    }

    public void isEmpty(String val){
        //The isEmpty() method checks whether a string is empty or not.
        //It returns true if the length of the string is 0, otherwise, it returns false.
        print(val.isEmpty());
    }

    public void length(String val){

        //The length() method returns the length of a string.
        //The length is equal to the number of 16-bit Unicode characters in the string.
        print(val.length());
    }

    public void replace(String val, String oldChar, String newChar){

        //The replace() method replaces all occurrences of a specified character or substring in a string with another character or substring.
        //It returns a new string that represents the replacement.
        //The replace() method is case-sensitive.
        //To perform a case-insensitive replacement, you can use the replaceAll() method.
        //The replace() method doesn't change the original string.
        print(val);
        print(val.replace(oldChar, newChar));
    }

    // public void replaceAll()

    //difference between replace() and replaceAll()
    //The replace() method replaces all occurrences of a specified character or substring in a string with another character or substring.
    //The replaceAll() method replaces all occurrences of a specified character or substring in a string with another character or substring.
    //The replaceAll() method is case-sensitive.
    //To perform a case-insensitive replacement, you can use the replaceAll() method.
    //The replaceAll() method doesn't change the original string.





    //generic method to print any type of array
    public <T> void print(T[] value){
        // for(T val : value){
        //     System.out.println(val);
        // }
        System.out.println(Arrays.toString(value));
    }

    //generic method to print any type of value
    public <T> void print(T value){
        System.out.println(value);
    }


    public static void main(String[] args) {
        
        CustomString cs = new CustomString();
        //charAt()
        cs.charAt("val", 2);

        //concat()
        cs.concat("Hello", "World");

        // //contains()
        cs.contains("ashiq", "ash");

        // //indexOf()
        cs.indexOf("val");


        //join()
        // array to string
        String[] str = {"Hello", "World", "Java"};
        cs.join(str);

        //split()
        // string to array
        String ar = "Hello, World, Java";
        cs.split(ar);

        //replace()
        cs.replace("Hello", "H", "J");




        
    }

}

/* 
charAt()
concat()
contains()
endsWith()
equals()
equalsIgnoreCase()
format()
indexOf()
isEmpty()
join()
lastIndexOf()
length()
matches()
replace()
replaceAll()
replaceFirst()
split()
startsWith()
substring()
toLowerCase()
toString()
toUpperCase()
trim()
valueOf()
    */


