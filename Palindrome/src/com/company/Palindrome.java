package com.company;

public class Palindrome {
    // Вывод ответа, является ли строка палиндромом
    public static void main(String[]args){
        for(int i = 0; i < args.length; i++){
            String s = args[i];
            System.out.println (isPalindrome(s));
        }
    }
    // Инверсия строки
    public static String reverseString(String str) {
        String s1 = "";
        for(int i = str.length()-1; i>=0; i--){
            s1 += str.charAt(i);
        }
        return s1;
    }
    // Сравнение введенной строки с обратной ей
    public static boolean isPalindrome(String s){
        return (reverseString(s).equals(s));
    }
}
