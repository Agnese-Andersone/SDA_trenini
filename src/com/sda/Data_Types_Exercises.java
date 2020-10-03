package com.sda;
import java.util.Scanner;
public class Data_Types_Exercises {
    //1.uzd
    public static void sumOfTwo() {
        int num1 = 74, num2 = 36;
        System.out.println(num1 + num2);
    }

    //2.uzd
    public static void divide() {
        int a = 50, b = 3;
        System.out.println(a + " / " + b + " = " + a / b + " remainder " + a % b);
    }

    //3.uzd
    public static void variousResults(int... a) {

        int op1 = a[0] + a[1] * a[2],
                op2 = (a[3] + a[4]) % a[4],
                op3 = a[5] + a[6] * a[7] / a[8],
                op4 = a[7] + a[9] / a[10] * a[11] - a[8] % a[10];

        System.out.printf("%d + %d * %d = %d\n", a[0], a[1], a[2], op1);
        System.out.printf("(%d + %d) %% %d = %d\n", a[3], a[4], a[4], op2);
        System.out.printf("%d + %d * %d / %d = %d\n", a[5], a[6], a[7], a[8], op3);
        System.out.printf("%d + %d / %d * %d - %d %% %d = %d\n", a[7], a[9], a[10], a[11], a[8], a[10], op4);
    }

    //4. uzd
    public static void computing(double... a) {

        double result = ((a[0] * a[1] - a[1] * a[1]) / (a[2] - a[3]));

        System.out.printf("((%.1f * %.1f - %.1f * %.1f) / (%.1f %.1f) = %.15f", a[0], a[1], a[1], a[1], a[2], a[3], result);
    }

    // 5. uzd
    public static void circle(double radius) {
        System.out.println();
        System.out.println("Area = " + Math.PI * Math.pow(radius, 2) + "; Perimeter = " + 2 * Math.PI * radius);
    }

    //6. uzd
    public static double calcWithInp(double... args) {
        double res = (args[0] + args[1] + args[2]) / args.length;
        System.out.println(res);
        return res;

        }
    //7. uzd
    public static void square(double width, double height){
        System.out.println();
        System.out.println("Area =" + width * height + "; Perimeter = " + 2 * (width + height));
    }
    //8. uzd
    public static void swap(){
        int a= 5, b = 13, c;
        c = a;
        a = b;
        b = c;
        System.out.println("a: " + a + "; b: " + b);
    }
    //9.uzd
    public static void compare(int first, int other){
        if (first > other) {
            System.out.println(first + " > " + other);
        }
        if (first < other){
            System.out.println(first + " < " + other);
        }
        if (first == other){
            System.out.println(first + " = " + other);
        }
        if (first != other){
            System.out.println(first + " != " + other);
        }
        if (first <= other){
            System.out.println(first + " <= " + other);
        }
        if (first >= other){
            System.out.println(first + " >= " + other);
        }

    }
    //10. uzd
    public static void sumOfDigits() {
        int a = 133;
        String stringX = String.valueOf(a);
        int result = 0;
        for (int i = 0; i < stringX.length(); i++) {
            result += Character.getNumericValue(stringX.charAt(i));
        }
        System.out.println(result);
    }
    }









