package com.sda;
import sun.security.mscapi.CPublicKey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Last_coding_exercises {
    public static void bmiCalc(float kg, int height) {
        System.out.println("2. uzd BMI");
        double bmi = kg / Math.pow(height * 0.01, 2);

        if (bmi > 18.5) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }

    public static void calc(int a, int b, int c) {
        System.out.println("3. uzd calc");
        double d = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;
        if (d < 0) {
            System.out.println("Delta negative");
        } else if (d == 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 un X2 = " + x1);
        } else {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1 + "; X2 = " + x2);
        }
    }

    public static void fizzBuzz2(int a) {
        System.out.println("different fizzbuzz");
        for (int i = 1; i < a; i++) {

            if ((i % 3 == 0 && i % 7 == 0)) {
                System.out.print("FizzBuzz\n");
            } else if (i % 7 == 0) {
                System.out.print("Buzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void sumOfHarm(int n) {
        System.out.println("6. uzd");
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += 1 / (double) i;
        }
        System.out.println(h);
    }

    public static void task8Calc() {
        System.out.println("8. uzd - Calculator");
        System.out.println("Simple Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli 1: ");
        float firstNr = input.nextFloat();
        Scanner input1 = new Scanner(System.in);
        System.out.println("ievadi darbības zīmi: ");
        String symb = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ievadi skaitli 2: ");
        float secondNr = input2.nextFloat();

        char s = symb.charAt(0);
        float rez = 0;
        if (s == '+') {
            rez = firstNr + secondNr;
            System.out.println(rez);
        } else if (s == '-') {
            rez = firstNr - secondNr;
            System.out.println(rez);
        } else if (s == '*') {
            rez = firstNr * secondNr;
            System.out.println(rez);
        } else if (s == '/') {
            if (secondNr == 0) {
                System.out.println("Cannot calculate");
            }
            rez = firstNr / secondNr;
            System.out.println(rez);
        }
    }

    public static void starsWave(int len) {
        int height = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < len; j++) {
                if (j % 8 == 0 + i || j % 8 == 7 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void task10(int n) {
        System.out.println("10.uzd");
        String number = Integer.toString(n);
        char c[] = number.toCharArray();
        int sum = 0;
        for(int i = 0; i<c.length; i++){
            String s = Character.toString(c[i]);
            int num = Integer.parseInt(s);
            sum +=num;
        }
        System.out.println(sum);
    }

    public static void task11() {
        System.out.println("11. uzd - Text reader");
        Scanner ievade = new Scanner(System.in);
        String txt;
        String longest = "";

        while (true) {
            txt = ievade.nextLine();
            if (txt.equals("Enough!")) {
                if (longest.equals("")) {
                    System.out.println("No text provided!");
                } else {
                    System.out.println(longest);
                }
                break;
            } else if (longest.length() < txt.length()) {
                longest = txt;
            }
        }
    }

    public static void task12() {
        System.out.println("12. uzd - Count percentage of space character");
        Scanner input = new Scanner(System.in);
        int count = 0;
        String text;
        double space;
        text = input.nextLine();
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                count++;
            }
        }
        space = count/(double)
                text.length()*100f;
        System.out.println(space + "%");
    }

    public static void task13() {
        System.out.println("13. uzd - Stuttering");
        Scanner ievade = new Scanner(System.in);
        String[] text = ievade.nextLine().split(" ");
        for (String word : text){
            System.out.println(word + " " + word + " ");
        }
    }

    public static void task14() {
        System.out.println("14. uzd - difference between letters");
        Scanner input = new Scanner(System.in);
        char in1 = input.nextLine().charAt(0);
        char in2 = input.nextLine().charAt(0);
        int rez = 0;
        if (in1 >= 97 && in1 <= 122 && (in2 >= 97 && in2 <= 122)) {
            if (in1 > in2) {
                rez = in1 - in2 - 1;
            } else if (in1 == in2) {
                rez = 0;
            } else {
                rez = in2 - in1 - 1;
            }
            System.out.println(rez);
        } else {
            System.out.println("Invalid input");
        }

    }

    public static void task15() {
        System.out.println("15. uzd print numbers that occur at least twice");
        Scanner input = new Scanner(System.in);
        int[] masivs = new int[10];
        ArrayList<Integer> jaunsMasivs = new ArrayList<>();
        for (int i = 0; i < masivs.length; i++) {
            masivs[i] = input.nextInt();
        }
        for (int i = 0; i < masivs.length; i++) {
            for (int j = i + 1; j < masivs.length; j++) {
                if (masivs[i] == masivs[j]) {
                    if (!jaunsMasivs.contains(masivs[i])) {
                        jaunsMasivs.add(masivs[i]);
                    }
                }
            }
        }

        for (Integer i : jaunsMasivs) {
            System.out.println(i);
        }
    }

    public static void task16() {

            int[] array = new int[10];
            Scanner input = new Scanner(System.in);
            System.out.println("Ieraksti 10 skaitļus");
            int count = 1;
            int maxCount = count;

            for(int i = 0; i < array.length;i++) {
                array[i] = input.nextInt();
            }
            for(int i = 1; i < array.length; i++) {
                if(array[i] >= array[i-1])
                    count++;
                else {
                    if(maxCount < count)
                        maxCount = count;
                    count = 1;
                }
            }
            System.out.println("Lielākā augošā secība: " + maxCount);
    }
    public static void task17(){
        System.out.println("17. uzd - Calculate remaining days");
        Scanner input = new Scanner(System.in);
        System.out.println("Ieraksti gadu:");
        int yearInput = input.nextInt();
        int y = Integer.parseInt(String.valueOf(yearInput));
        System.out.println("Ieraksti mēnesi:");
        int monthInput = input.nextInt();
        int m = Integer.parseInt(String.valueOf(monthInput));
        System.out.println("Ieraksti dienu:");
        int dayInput = input.nextInt();
        int d = Integer.parseInt(String.valueOf(dayInput));

        LocalDate nextStudyDate = LocalDate.of(y,m,d);
        System.out.println("The next study date is: " + nextStudyDate);

        LocalDate today = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(today, nextStudyDate);

        if (daysBetween > 0) {
            System.out.println("Remaining days until your next training are: " + daysBetween);
        } else if (daysBetween ==0 ) {
            System.out.println("Your training is today!");
        } else {
            System.out.println("Sorry, you missed it!");
        }
    }

    public static void task18(){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        Pattern pattern = Pattern.compile("acho.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("You sneezed!");
        } else {
            System.out.println("Good job!");
        }
    }
    public static void task20(){
        System.out.println("20. task Spēle");
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(101);
        System.out.println(r);
        while(true){
            int userInt = input.nextInt();
            if (userInt >a){
                System.out.println("Too much!");
            } else if (userInt < a) {
                System.out.println("Not enough!");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }
    }

}





