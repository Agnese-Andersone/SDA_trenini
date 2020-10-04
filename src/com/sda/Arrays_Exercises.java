package com.sda;
import java.util.Arrays;


public class Arrays_Exercises {
    //1.uzd
    public static void arrays1(int... a) {
        System.out.println("\n 1. uzd. Sum all values");

        int sum = 0;
        for (int i = 0; i < (int) a.length; i++) {
            sum += (int) a[i];
        }
        System.out.println(sum);
    }

    //2. uzd
    public static void arrays2(int... a) {
        System.out.println("\n 2. uzd. Average of all values");
        int sum = 0;
        for (int i = 0; i < (int) a.length; i++) {
            sum += (int) a[i];
        }
        System.out.println(sum / (double) a.length);
    }

    //3. uzd
    public static void arrays3(int... a) {
        System.out.println("\n 3. uzd. All odd values");

        for (int i = 0; i < (int) a.length; i++) {
            if ((int) a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }

    //4. uzd
    public static void arrays4(int... a) {
        System.out.println("4.uzd Min&Max\n");
        int max = (int) a[0], min = (int) a[0];
        for (int val : a) {
            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
        }
        System.out.printf("Min=%d; Max=%d", min, max);
        System.out.println("\n");
    }
/*
    //5. uzd
    public static void arrays5() {
        System.out.println("5.uzd. Reversed array\n");
        int [] array = {1, 7, 3, 10, 9};
        int[] y = new int[array.length];
        int i;
        for (i = 0; i <= array.length; i++) {
            y[i] = array[array.length - 1 - i];
            System.out.print(y[i] + " ");
        }
    }

    //6. uzd
    public static void arrays6() {
        System.out.println("6.uzd. Odd, Even \n");
        int [] array = {1, 7, 3, 10, 9};
        int countOdd = 0, countEven = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }
        }
        System.out.println("Odd= " + countOdd + "; Even= " + countEven);
    }

    //7. uzd.
    public static void arrays7(int value, int position) {
        System.out.println("7.uzd. add new value \n");
        int[] array = {1, 7, 3, 7, 10, 1, 9};
        int[] array1 = new int[array.length + 1];

        for (int i = 0; i < position; i++){
            array1[i] = array[i];
            System.out.print(array1[i] + " ");
        }
        System.out.print(value + " ");
        for (int i= position+1; i<=array1.length; i++){
            array1[i] = array[i-1];
            System.out.print(array1[i] + " ");
        }
    }*/
    //8. uzd
    public static void arrays8(){
        System.out.println("8. uzd. Find duplicates");
        int [] array = {1,7,3,7,10,1,9};
        for (int i=0; i< array.length; i++){
            for (int j = i+1; j< array.length; j++){
                if (array[i]==array[j]){
                System.out.print(array[i]+ " ");
                }
            }
        }
    }
    //9. uzd
    public static void arrays9(){
        System.out.println("\n 9. uzd. Find 2nd largest");
        int [] array = {1,7,3,10,9};
        int max = array[0];
        int max2 = array[0];

        for (int i=0; i < array.length; i++) {
            if (array[i] > max){
                max2 = max;
                max = array[i];
            } else if ( array[i] > max2 ) {
                max2 = array[i];
            }
            }
        System.out.println(max2);
        }
    //10.uzd
    public static void arrays10(int specNumber){
        System.out.println("\n 10. uzd. pairs of elements that make up specified number");

        boolean isFIrst = true;
        int[] array = {1,2,7,3,10,2,9,1,2,3,4,5,4};
        for (int i=0; i<array.length; i++){
            for (int j= i+1; j<array.length; j++){
                if (array[i] + array[j] ==specNumber){
                    if (isFIrst) {
                        System.out.print(array[i] + "-" + array[j]);
                        isFIrst = false;
                    } else {
                        System.out.print("; " + array[i] + "-" + array[j]);
                    }
                }
            }
        }
    }

}


