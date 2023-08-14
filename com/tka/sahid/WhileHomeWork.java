package com.tka.sahid;

public class WhileHomeWork {
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
        int i = 0;
        while(i<25){
            System.out.print(i+1+" ");
            i++;
        }
    }

    void exercise2(){
        int i = 25;
        while(i>0){
            System.out.print(i+1+" ");
            i--;
        }

    }
    void exercise3(){
        int i = 1;
        while(i<100){
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    void exercise4(){
        int i = 1;
        while(i<100){
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    void exercise5(){
        int i = 1;
        int sum = 0;
        while(i<50){
            if(i%2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
    void exercise6(){
        int d=1,sum1=0;
        while(d<=50) {
            if(d%2==0) {
                sum1 += d;
            }
            d++;
        }
        System.out.println(sum1);
    }
    void exercise7(){
        int i = -45;
        while(i<=45) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    void exercise8(){
        int i = 50;
        while(i<=100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    void exercise9(){
        int g=1,sum2=0;
        while(g<=50) {
            if(g%2!=0) {
                sum2+=g;
            }
            g++;
        }

        int h=1,sum3=0;
        while(h<=50) {
            if(h%2==0) {
                sum3 += h;
            }
            h++;
        }
        System.out.println(sum2 + sum3);
    }
    void exercise10(){
        int i=1;
        while(i<=100) {
            if(i%2!=0) {
                System.out.print(i + " ");

            }
            i++;
        }
        int j=1;
        while(j<=100) {
            if(j%2==0) {
                System.out.print(j + " ");

            }
            j++;
        }
        System.out.println();
    }
    void exercise11(){
        int i = 1;
        while(i<=100) {
            System.out.print(i + " ");
            i++;
        }
    }
    void exercise12(){
        int i = 100;
        while(i>=1) {
            System.out.print(i + " ");
            i--;
        }
    }
    void exercise13(){
        int i = 30;
        while(i<=50) {
            System.out.print(i + " ");
            i++;
        }
    }
    void exercise14(){
        int i=1,count1=0;
        while(i<=25) {
            if(i%2==0) {
                count1++;
            }
            i++;
        }
        System.out.println(count1);
    }
    void exercise15(){
        int n=1,count=0;
        while(n<=25) {
            if(n%2 == 0) {
                count++;
            }
            n++;
        }
        System.out.println(count);

    }
    void exercise01(){
        int i=2;
        while(i<=20) {
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
    }
    void exercise02(){
        int j=9;
        while(j<=90) {
            System.out.print(j+" ");
            j+=9;
        }
        System.out.println();
    }
    void exercise03(){
        int k=1,l=-2;
        while(k<=9 && l>=-10) {
            System.out.print(k+" "+l+" ");
            k+=2;
            l-=2;
        }
        System.out.println();
    }
    void exercise04(){
        int m=5;
        while(m<=50) {
            System.out.print(m+" ");
            m+=5;
        }
    }
    void exercise05(){
        int b=1;
        while(b<=1000) {
            System.out.print(b+" ");
            b*=10;
        }
        System.out.println();
    }
    void exercise06(){
        int a=1,s=-1;
        while(a<=45) {
            System.out.print(a+" ");
            s++;
            a+=2+s;
        }

    }
    void exercise07(){
        int d=8;
        while(d<=80) {
            System.out.print(d+" ");
            d+=8;
        }

    }
    void exercise08(){
        int e=0,r=1;
        while(e<=21) {
            System.out.print(e+" ");
            int c = e+r;
            e=r;
            r=c;
        }
        System.out.println();
    }
    void exercise09(){
        int h=1;
        while(h<=10) {
            System.out.print(h*h+" ");
            h++;
        }
        System.out.println();

    }
    void exercise010(){
        int o=3;
        while(o<=30) {
            System.out.print(o+" ");
            o+=3;
        }
        System.out.println();
    }
    void exercise011(){
        int u=7;
        while(u<=70) {
            System.out.print(u+" ");
            u+=7;
        }
        System.out.println();
    }
    void exercise012(){
        int p=4;
        while(p<=40) {
            System.out.print(p+" ");
            p+=4;
        }
        System.out.println();

    }
    void exercise013(){
        int g=10;
        while(g<=100) {
            System.out.print(g+" ");
            g+=10;
        }
        System.out.println();
    }
    void exercise014(){
        int x=1,y=4;
        while(x<=5) {
            System.out.print(x+" ");
            x++;
        }
        while(y>=1) {
            System.out.print(y+" ");
            y--;
        }
        System.out.println();
    }
    void exercise015(){
        int t=6;
        while(t<=60) {
            System.out.print(t+" ");
            t+=6;
        }
        System.out.println();
    }

public static void main(String[] args) {
    WhileHomeWork f =  new WhileHomeWork();
    f.exercise2();
    f.exercise1();
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
