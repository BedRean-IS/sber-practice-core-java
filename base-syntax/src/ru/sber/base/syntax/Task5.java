package ru.sber.base.syntax;
import java.util.Scanner;

public class Task5 {
    static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вес: ");
        float weight = in.nextInt();
        System.out.print("Этот вес на луне будет = " + weight/100*17);
    }
}
