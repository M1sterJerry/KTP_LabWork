package com.company;

public class Primes {
    // Вывод простых чисел от 2 до 100
    public static void main(String[] args) {
        System.out.print("Простые числа от 2 до 100: ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
    // Проверка на простое число
    public static boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}
