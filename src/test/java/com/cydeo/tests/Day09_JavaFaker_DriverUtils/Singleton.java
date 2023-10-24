package com.cydeo.tests.Day09_JavaFaker_DriverUtils;

import org.testng.annotations.Test;

public class Singleton {
    //#1 create private cosntricutor
    private Singleton(){

    }

    //#2 private static String
    private static String word; //null is default value

    //#3 Utility method to return the private string we just created
    public static String getWord(){
        if (word == null){
            System.out.println("first time called, word object is null");
            System.out.println("assigning value to it");
            word = "something";

        }else{
            System.out.println("word already has a value");
        }

        return word;
    }

    @Test
    public void singleton_understanding_test1(){
        String str1 = Singleton.getWord();
        System.out.println("str1 = "+ str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);

    }

}
