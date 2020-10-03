package com.sda;

public class exercises_30082020 {
    public static void main (String[] args){


        //1. uzd
        int e = 10;
        int u = 5;

        if (e>u){
            System.out.println("E is greater than U");
        }
        else{
            System.out.println("E is not greater than U");
        }
        //2. uzd
        int a = 9;
        if (a%2==0){
            System.out.println("is even");
                }
        else {
            System.out.println("is odd");
        }
        //3. uzd
        int year = 2020;
        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println("is leap year");
        }
        else {
            System.out.println("is not leap year");
        }
        // 4. uzd
        int num = 4;
        if(num%3==0 && num%5==0) {
            System.out.println("fizzbuzz");
        }
        else if (num%5==0) {
            System.out.println("fizz");
        }
        else if (num%3==0){
                    System.out.println("buzz");
                }
        else {
            System.out.println("cant'be divided by 5 or 3");
            }
        }


   }
