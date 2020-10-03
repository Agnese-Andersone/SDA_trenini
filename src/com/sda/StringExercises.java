package com.sda;

import java.sql.SQLOutput;

public class StringExercises {
    //1. uzd hello un next line vārds
    public static void hello() {
        System.out.println("Hello");
        System.out.println("Agnese");
    }
    //2. uzd
    public static void printJava(){
        System.out.println("   J    a   v     v  a   ");
        System.out.println("   J   a a   v   v  a a  ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    //3. uzd
    }
    public static void toLowercase(){
        System.out.println();
        String inCaps = new String ("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        System.out.println(inCaps.toLowerCase());
    }
    //4.uzd
    public static void reverse(){
        System.out.println();
        StringBuilder original = new StringBuilder("avaJ");
        original.reverse();
        System.out.println(original);
    }
    //5. uzd
    public static void prog (String programmer){
        System.out.println();
        System.out.println(programmer.substring(0,programmer.length()/2));

    }
    //6. uzd
    public static void concat (){
        System.out.println();
        String str1 = "Java", str2 = "Fundamentals";
        System.out.println(str1.substring(1,str1.length()).concat(str2.substring(1, str2.length())));
    }
    //7. uzd
    public static void getLength (){
        String string = "This is Java!";
        System.out.println(string.length() + " characters");
    }
    //8. uzd
    public static void compareStrings (){
        String str1 = "This is a comparison", str2 = "THIS is a comparison";
        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);
    }
    //9. uzd
    public static void endsWith(){
        String str1 =  new String ("Java exercises");
        boolean retVal;
        retVal = str1.endsWith("ses");
        System.out.println(retVal);
    }
    //10.uzd
    public static void countAll() {
        String given = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (char c : given.toCharArray()) {
            if (Character.isLetter(c))
                letters++;
            else if (Character.isSpaceChar(c))
                spaces++;
            else if (Character.isDigit(c))
                numbers++;
            else others++;
        }
        System.out.println(letters + " letters, " + spaces + " spaces, " + numbers + " numbers, " + others + " others");
    }

    }

