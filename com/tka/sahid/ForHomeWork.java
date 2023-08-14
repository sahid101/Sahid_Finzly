package com.tka.sahid;

public class ForHomeWork {
/*
1) Write a Program To print 1 to 25 nos.
2) Write a Program To print 25 to 1 nos.
3) Write a Program To print 1 to 100 Odd nos.
4) Write a Program To print 1 to 100 even nos.
5) Write a Program To print sum of 1 to 50 Odd nos.
6) Write a Program To print sum of 1 to 50 EVEN nos.
7) Write a Program To print -45 to +45 nos.  // negative no and positive no
8) Write a Program To print 50 to 100 nos.
9) Write a Program To print sum of odd and even no.
10) Write a Program To print even and odd No
11) Write a Program To	 print 1 to 100 no.
12) Write a Program To print 100 to 1 no.
13) Write a Program To print 30 to 50 no.
14) Write a Program To print count of even No 1 to 25 no.
15) Write a Program To print count of odd No 1 to 25 no.
*/
/*
1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
2) Generate the Series... 9 18 27 36 45 54 63 72 81 90.
3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
5) Generate the Series... 1 10 100 1000.
6) Generate the Series... 1  3  6  10  15  21  28  36  45.
7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
8) Generate the Series... 0 1 1 2 3 5 8 13 21.
9) Generate the series... 1 4 9 16 25 36 49 64 81 100.
10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
11) Generate the Series... 7 14 21 28 35 42 49 56 63 70.
12) Generate the Series... 4 8 12 16 20 24 28 32 36 40.
13) Generate the Series... 10 20 30 40 50 60 70 80 90 100.
14) Generate the Series... 1 2 3 4 5 4 3 2 1.
15) Generate the Series... 6 12 18 24 30 36 42 48 54 60.
 */

    void exercise1(){
        for(int i = 1; i <= 25; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    void exercise2(){
        for (int i=25; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void exercise3(){
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    void exercise4(){
        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    void exercise5(){
        int sum = 0;
        for (int i = 1; i <= 50; i+=2) {
            sum += i;
        }
        System.out.print("Sum of odd number = "+sum);
        System.out.println();
    }
    void exercise6(){
        int sum = 0;
        for (int i = 0; i <= 50; i+=2) {
            sum += i;
        }
        System.out.print("Sum of even number = "+sum);
        System.out.println();

    }
    void exercise7(){
        for (int i = -45; i <= 45; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    void exercise8(){
        for (int i = 50; i <= 100; i++) {
            System.out.print(i+ " " );
        }
        System.out.println();
    }
    void exercise9(){
        int sumOfOdd = 0, sumOfEven = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2 == 0) sumOfEven += i;
            else sumOfOdd += i;
        }
        System.out.println("Sum of even = "+sumOfEven+" Sum of odd = "+sumOfOdd);
    }
    void exercise10(){
        for (int i = 0; i <= 50; i++) {
            if(i%2 == 0) System.out.println(i+" even ");

            else System.out.println(i + " odd ");
        }
    }
    void exercise11(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    void exercise12(){
        for (int i = 100; i > 0; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();

    }
    void exercise13(){
        for (int i = 30; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    void exercise14(){
        int countOfEven = 0;
        for (int i = 1; i <= 25; i++) {
            if(i % 2 == 0)  countOfEven += 1;
        }
        System.out.println("Count Of Even : "+countOfEven);
    }
    void exercise15(){
        int countOfOdd = 0;
        for (int i = 1; i <= 25; i++) {
            if(i % 2 != 0)  countOfOdd += 1;
        }
        System.out.println("Count Of Odd : "+countOfOdd);
    }
    void exercise01(){
        for (int i = 2; i <= 20; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void exercise02(){
        for (int i = 9; i <= 90; i+=9) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    void exercise03(){
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 0) System.out.print(-i+" ");
            else System.out.print(i+ " ");
        }
        System.out.println();
    }
    void exercise04(){
        for (int i = 5; i < 51; i+=5) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void exercise05(){
        for (int i = 1; i <= 1000; i=i*10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    void exercise06(){
        int sum1 = 0;
        for (int i = 1; i <= 50; i++) {
            sum1 = sum1 + i;
            System.out.println(sum1);
        }
    }
    void exercise07(){
        for (int i = 8; i < 100; i += 8) {
            System.out.println(i);
        }

    }
    void exercise08(){
        int first = 0, second = 1;
        int third = 0;
        System.out.println(first+ "\n"+second);
        for (int i = 0; i < 20; i++) {
            third = first+second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
    void exercise09(){
        int d = 0;
        for (int i = 0; i < 20; i++) {
            if(i%2 != 0){
                d = d+i;
                System.out.println(d);
            }
        }
    }
    void exercise010(){
        for (int i = 3; i < 30; i+=3) {
            System.out.println(i);
        }
    }
    void exercise011(){
        for (int i = 7; i <=70; i+=7) {
            System.out.print(i+ " ");
        }
        System.out.println();

    }
    void exercise012(){
        for (int i = 4; i <=40; i+=4) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    void exercise013(){
        for (int i = 10; i <=100; i+=10) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    void exercise014(){
        int s = 1;
        int e = 4;
        for (int i = 0; i < 10; i++) {
            if(i<5) {
                System.out.println(s);
                s++;
            }
            else if(i>5){
                System.out.println(e);
                e--;
            }
        }
    }
    void exercise015(){
        for (int i = 6; i <=60; i+=6) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ForHomeWork f = new ForHomeWork();
        f.exercise1();
        f.exercise2();
        f.exercise3();
        f.exercise4();
        f.exercise5();
        f.exercise6();
        f.exercise7();
        f.exercise8();
        f.exercise9();
        f.exercise10();
        f.exercise11();
        f.exercise12();
        f.exercise13();
        f.exercise14();
        f.exercise15();
        f.exercise01();
        f.exercise01();
        f.exercise02();
        f.exercise03();
        f.exercise04();
        f.exercise05();
        f.exercise06();
        f.exercise07();
        f.exercise08();
        f.exercise09();
        f.exercise010();
        f.exercise011();
        f.exercise012();
        f.exercise013();
        f.exercise014();
        f.exercise015();
    }
}
