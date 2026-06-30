package ru.sber.base.syntax;

public class Task3 {
    static void main(){

        int num = 12321;

        int copy_num = num;
        int rev_num = 0;
        while (copy_num > 0){
            rev_num = rev_num * 10 + copy_num % 10;
            copy_num = copy_num / 10;
        }
        if(num == rev_num){
            System.out.print("Число " + num + " палиндром");
        } else {
            System.out.print("Число " + num + " не палиндром");
        }
    }
}
