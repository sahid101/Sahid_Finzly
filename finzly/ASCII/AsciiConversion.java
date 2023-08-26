package com.finzly.ASCII;

import java.util.Scanner;

class AsciiConversion {

    public static String ASCIIConversion(String str) {
        // code goes here
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == ' '){
                ans.append(" ");
                continue;
            }
            ans.append((int) temp);
        }
        return ans.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ASCIIConversion(s.nextLine()));
    }
}