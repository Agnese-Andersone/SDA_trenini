package com.sda;

public class Loop_Exercises {

    //1.uzd
    public static void loop1(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(number * i + ", ");
        }
    }

    //2. uzd
    public static void loop2(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    //3. uzd
    public static void loop3(int num) {
        System.out.println();
        String numStr = " ";
        for (int i = num; i > 0; i--) {
            numStr += num;
            System.out.println(numStr + " ");
        }
    }

    //4. uzd
    public static void loop4(int number) {
        System.out.print("Divided by 3 - ");
        for (int i = 1; i <= number; i++) {
            while (i % 3 == 0) {
                System.out.print(i + ", ");
                i++;
            }
        }
        System.out.println();
        System.out.print("Divided by 5 - ");
        for (int i = 1; i <= number; i++) {
            while (i % 5 == 0) {
                System.out.print(i + ", ");
                i++;
            }
        }
        System.out.println();
        System.out.print("Divided by 3 & 5 - ");
        for (int i = 1; i <= number; i++) {
            while (i % 3 == 0 & i % 5 ==0) {
                System.out.print(i + ", ");
                i++;
            }
        }
    }

    //5. uzd
    public static void loop5(int number){
        int power = 0;
        long result = (long) Math.pow(number, power);

        while (result <=100){
            System.out.print(result + ", ");
            power++;
            result =(long) Math.pow(number, power);

        }
        System.out.println();
    }
    //6. uzd
    public static void loop6(int count){
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " "+ n2);

        for (int i = 2; i<count; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
    //7. uzd
    public static void loop7(){
        for (int i = 1; i <= 5; i++)
        {
            int n = 5;
            for (int j = 1; j<= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(i);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--)
        {
            int n = 3;
            System.out.println();
        }
        }
    //8. uzd
    public static void loop8(int n){
        //int n;
        int status = 1;
        int num = 3;

        if (n >= 1)
        {
            System.out.print(2);
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.print(", " +num);
                i++;
            }
            status = 1;
            num++;

    }
    }
    //9.uzd
    public static void loop9(int n){
        int sk = 0;
        System.out.println();
        for (int i=0; i <= n-1; i++){
            sk += n;
            System.out.print(sk + " ");
        }
        }
    //10. uzd
    public static void loop10(int n){
        int sk = 1;
        System.out.println();
        for (int i = 1; i <= n; i++){
            sk *= i;
        }
        System.out.println(sk);
    }
    }











