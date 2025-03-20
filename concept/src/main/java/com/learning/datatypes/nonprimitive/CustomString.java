package com.learning.datatypes.nonprimitive;


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
        print(String.join(" ", val));
    }

    //split() method splits a string into an array of substrings
    public void split(String val){
        String[] rs = val.split(", ");
        print(rs);
    }





    public <T> void print(T[] value){
        for(T val : value){
            System.out.println(val);
        }
    }
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
        String[] str = {"Hello", "World", "Java"};
        cs.join(str);

        //split()
        String ar = "Hello, World, Java";
        cs.split(ar);


        
    }

}
