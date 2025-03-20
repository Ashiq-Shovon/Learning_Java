package com.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


    List<String> listOfBrands = new ArrayList<>();


    
    public void addBrand(String brandName){
        listOfBrands.add(brandName);
    }
    
    public void removeBrand(String brandName){
        listOfBrands.remove(brandName);
    }
    
    public void getDistinct(){

        listOfBrands = listOfBrands.stream().distinct().collect(Collectors.toList());
        
    }


    public void filter(){
        listOfBrands = listOfBrands.stream().filter(e -> e.equals("honda")).collect(Collectors.toList());
    }
    public void print(){
        listOfBrands.forEach( (e) ->{
            System.out.println(e);
        });
    }

    public static void main(String[] args) {

        Stream stream = new Stream();
        stream.addBrand("honda");
        stream.addBrand("honda");
        stream.addBrand("suzuki");
        stream.addBrand("yamaha");
        stream.addBrand("hero");

        stream.getDistinct();

        // stream.print();

        stream.filter();

        stream.print();

        
        
    }

}
