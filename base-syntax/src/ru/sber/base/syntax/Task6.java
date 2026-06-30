package ru.sber.base.syntax;
import java.util.Scanner;

public class Task6 {
    static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = in.nextInt();
        if (n < 2){
            System.out.print("Число не простое");
            return;
        }
        boolean flag = true;

        int i = 2;
        while (i * i <= n){
            if (n % i == 0){
                flag = false;
                break;
            }
            i++;
        }
        if (flag){
            System.out.print("Число простое");
        } else{
            System.out.print("Число не простое");
        }
    }
}
