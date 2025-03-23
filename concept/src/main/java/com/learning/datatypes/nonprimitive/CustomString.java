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

    public void replaceFirst(String val, String oldChar, String newChar){
        //The replaceFirst() method replaces the first occurrence of a specified character or substring in a string with another character or substring.
        //It returns a new string that represents the replacement.
        //The replaceFirst() method is case-sensitive.
        //To perform a case-insensitive replacement, you can use the replaceAll() method.
        //The replaceFirst() method doesn't change the original string.
        print(val.replaceFirst(oldChar, newChar));
    }

    public void replaceAll(String val, String oldChar, String newChar){
        //The replaceAll() method replaces all occurrences of a specified character or substring in a string with another character or substring.
        //It returns a new string that represents the replacement.
        //The replaceAll() method is case-sensitive.
        //To perform a case-insensitive replacement, you can use the replaceAll() method.
        //The replaceAll() method doesn't change the original string.
        print(val.replaceAll(oldChar, newChar));
    }

    public void equals(String val1, String val2){
        //The equals() method compares two strings.
        //It returns true if the strings are equal, otherwise, it returns false.
        //The comparison is case-sensitive.
        //To perform a case-insensitive comparison, you can use the equalsIgnoreCase() method.
        print(val1.equals(val2));
    }

    public void equalsIgnoreCase(String val1, String val2){
        //The equalsIgnoreCase() method compares two strings.
        //It returns true if the strings are equal, otherwise, it returns false.
        //The comparison is case-insensitive.
        //To perform a case-sensitive comparison, you can use the equals() method.
        print(val1.equalsIgnoreCase(val2));
    }


    public void toLowerCase(String val){
        //The toLowerCase() method converts all characters in a string to lowercase.
        //It returns a new string that represents the lowercase string.
        print(val.toLowerCase());
    }



    public void toUpperCase(String val){
        //The toUpperCase() method converts all characters in a string to uppercase.
        //It returns a new string that represents the uppercase string.
        print(val.toUpperCase());
    }

    public void startsWith(String val, String prefix){
        //The startsWith() method checks whether a string starts with a specified prefix.
        //It returns true if the string starts with the specified prefix, otherwise, it returns false.
        print(val.startsWith(prefix));
    }


    public void endsWith(String val, String suffix){
        //The endsWith() method checks whether a string ends with a specified suffix.
        //It returns true if the string ends with the specified suffix, otherwise, it returns false.
        print(val.endsWith(suffix));
    }

    public void trim(String val){
        //The trim() method removes leading and trailing whitespace from a string.
        //It returns a new string that represents the trimmed string.
        print(val.trim());
    }

    public void toString(Object val){
        //The toString() method returns the string representation of an object.
        //If you print an object, the toString() method is called implicitly.
        print(val.toString());
    }

    public void subString(String val, int start, int end){
        //The substring() method extracts a substring from a string.
        //It returns a new string that represents the extracted substring.
        //The substring() method has two variants:
        //substring(int beginIndex): It returns a substring that starts from the specified index to the end of the string.
        //substring(int beginIndex, int endIndex): It returns a substring that starts from the specified beginIndex and ends at the specified endIndex.
        print(val.substring(start, end));
    }


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
        cs.replace("Hello", "l", "J");

        //equals()

        cs.equals( "Hello", "hello");

        //equalsIgnoreCase()
        cs.equalsIgnoreCase("Hello", "hello");


        //toLowerCase()
        cs.toLowerCase("ArIjIt");


        //toUpperCase()

        cs.toUpperCase("ArIjIt");


        //startsWith()
        cs.startsWith("arif", "ari");

        //endsWith()
        cs.endsWith("arif", "if");

        //trim()
        cs.trim("  arif  ");


        //toString()
        cs.toString(123);

        //replaceFirst()
        cs.replaceFirst("Hello", "l", "j");

        //replaceAll()
        cs.replaceAll("Hellodflldfll", "l", "j");

        //subString()
        cs.subString("Hello", 1, 3);

        
    }

}

/* 
charAt()
concat()
contains()
endsWith()
equals()
equalsIgnoreCase()
format() ddd
indexOf()
isEmpty()
join()
lastIndexOf() ddd
length()
matches() dd
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
valueOf() ddd
    */


