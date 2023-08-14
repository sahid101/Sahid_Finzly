package com.tka.sahid;

public class Vowels{

    static void checkVowels(String str){
        str = str.toLowerCase();
        String[] strArray = str.split(" ");
        for (String a:strArray) {
            if(checkWords(a)){
                System.out.println(a+" has all vowels");
            }
        }
    }

    static boolean checkWords(String word){
        String v = "aeiou";
        int d=0, s=0;
        for (int i = 0; i < v.length(); i++) {
            for (int j = 0; j < word.length(); j++){
                if(v.charAt(i) == word.charAt(j)){
                    d++;
                    s+=d;
                    d=0;
                    break;
                }
            }
        }
        if(s==5) return true;
        else return false;

    }
    public static void main(String[] args){
        String str = "Reputation has to be eutopia , enthusiatic, probability sequoia and suoidea";
        checkVowels(str);
    }
}