package com.tka.sahid;

public class DoWhileHomework {

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
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<=25);
        System.out.println();
    }
    void exercise2(){
        int i = 25;
        do {
            System.out.print(i + " ");
            i--;
        }while(i>0);
        System.out.println();
    }
    void exercise3(){
        int i = 1;
        do {
            if(i%2!=0) {
                System.out.print(i + " ");
            }
            i++;
        }while(i<100);
        System.out.println();
    }
    void exercise4(){
        int i = 2;
        do {
            if(i%2==0) {
                System.out.print(i + " ");
            }
            i++;
        }while(i<=100);
        System.out.println();
    }
    void exercise5(){
        int i = 1;
        do {
            if(i%2!=0) {
                System.out.print(i + " ");
            }
            i++;
        }while(i<=50);
        System.out.println();

    }
    void exercise6(){
        int i = 2;
        do {
            if(i%2==0) {
                System.out.print(i + " ");
            }
            i++;
        }while(i<=50);
        System.out.println();
    }
    void exercise7(){
        int i = -45;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<= 45);
        System.out.println();

    }
    void exercise8(){
        int i = 50;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<= 100);
        System.out.println();
    }
    void exercise9(){
        int i = 0;
        int oddSum = 0;
        int evenSum = 0;
        do {
            if(i%2==0) {
                evenSum +=1;
            }else {
                oddSum +=1;
            }
            i++;
        }while(i< 100);
        System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
    }
    void exercise10(){
        int i = 0;
        do {
            if(i%2==0) {
                System.out.println(i+ " even");
            }else {
                System.out.println(i + " odd");
            }
            i++;
        }while(i<=100);

    }
    void exercise11(){
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<=100);
        System.out.println();
    }
    void exercise12(){
        int i = 100;
        do {
            System.out.print(i + " ");
            i--;
        }while(i>0);
        System.out.println();

    }
    void exercise13(){
        int i =  30;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<=50);
        System.out.println();

    }
    void exercise14(){
        int i = 1;
        int evensum = 0;
        do {
            if(i%2==0) {
                evensum +=1;
            }
            i++;
        }while(i<=25);
        System.out.println("Even Sum : "+ evensum);

    }
    void exercise15(){
        int i = 1;
        int oddSumSec = 0;
        do {
            if(i%2!=0) {
                oddSumSec +=1;
            }
            i++;
        }while(i<=25);
        System.out.println("Odd Sum : "+oddSumSec);
    }
    void exercise01(){
        int i = 2;
        do {
            System.out.print(i+" ");
            i+=2;
        }while(i<=20);
        System.out.println();
    }
    void exercise02(){
        int i = 9;
        do {
            System.out.print(i+" ");
            i+=9;
        }while(i<=90);
        System.out.println();

    }
    void exercise03(){
        int i = 1;
        int temp = 0;
        do {
            if(i%2 == 0) {
                temp = i;
                temp = i *-1;
                System.out.print(temp+" ");
            }else{
                System.out.print(i+" ");
            }
            i++;
        }while(i<=10);
        System.out.println();
    }
    void exercise04(){
        int a = 5;
        do {
            System.out.print(a+" ");
            a+=5;
        }while(a<=50);
        System.out.println();

    }
    void exercise05(){
        int i = 1;
        do {
            System.out.print(i+" ");
            i = i*10;
        }while(i<=1000);
        System.out.println();

    }
    void exercise06(){
        int i = 1;
        int tem = 1;
        do {
            System.out.print(i+" ");
            tem++;
            i += tem;
        }while(i <=45);
        System.out.println();
    }
    void exercise07(){
        int i = 8;
        do {
            System.out.print(i+" ");
            i+=8;
        }while(i<=80);
        System.out.println();

    }
    void exercise08(){
        int count = 0;
        int first = 0;
        int second = 1;
        int next = 0;

        do {
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
            count++;

        }while(count<9);
        System.out.println();
    }
    void exercise09(){
        int i = 1;
        do {
            System.out.print(i*i+" ");
            i++;
        }while(i<=10);
        System.out.println();
    }
    void exercise010(){
        int i = 3;
        do {
            System.out.print(i+" ");
            i+=3;
        }while(i<=30);
        System.out.println();
    }
    void exercise011(){
        int i = 7;
        do {
            System.out.print(i+" ");
            i+=7;
        }while(i<=70);
        System.out.println();
    }
    void exercise012(){
        int i = 4;
        do {
            System.out.print(i+" ");
            i+=4;
        }while(i<=40);
        System.out.println();
    }
    void exercise013(){
        int i = 1;
        do {
            System.out.print(i*10+" ");
            i++;
        }while(i<=10);
        System.out.println();
    }
    void exercise014(){
        int i = 1;
        int temp = 4;
        do {
            if(i <= 5) {
                System.out.print(i+" ");
            }
            if(i>5) {
                System.out.print(temp+" ");
                temp--;
            }
            i++;
        }while(i<10);
        System.out.println();
    }
    void exercise015(){
        int i = 6;
        do {
            System.out.print(i+" ");
            i+=6;
        }while(i<=60);
        System.out.println();
    }

    public static void main(String[] args) {
        DoWhileHomework f = new DoWhileHomework();
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
