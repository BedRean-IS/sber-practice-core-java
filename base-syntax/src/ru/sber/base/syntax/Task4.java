package ru.sber.base.syntax;

public class Task4 {
    static void main(){
        int n = 123;
        int res = n % 10 + n / 10 % 10 + n / 100 % 10;
        System.out.print("Сумма цифр числа " + n + " равна " + res);
    }
}
