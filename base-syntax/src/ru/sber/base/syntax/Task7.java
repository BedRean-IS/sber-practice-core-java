package ru.sber.base.syntax;
import java.util.Scanner;

public class Task7 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n от 3 до 99: ");
        int n = in.nextInt();
        long a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= n; ++i){
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
