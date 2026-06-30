package ru.sber.base.syntax;
import java.util.Scanner;

public class Task9 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a,b и c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if(d == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else{
            System.out.println("Корней нет");
        }
    }
}
