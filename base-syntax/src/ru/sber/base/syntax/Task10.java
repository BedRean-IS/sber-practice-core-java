package ru.sber.base.syntax;
import java.util.Scanner;

public class Task10 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100: ");
        int n = in.nextInt();
        if(n < 1 || n > 100){
            System.out.println("Число вне диапазона");
            return;
        }
        if(n == 100){
            System.out.println("Римская запись числа " + n + ": " +"С");
            return;
        }
        int tens = n / 10;
        int ones = n % 10;
        String roman = "";

        if (tens == 1) roman += "X";
        else if (tens == 2) roman += "XX";
        else if (tens == 3) roman += "XXX";
        else if (tens == 4) roman += "XL";
        else if (tens == 5) roman += "L";
        else if (tens == 6) roman += "LX";
        else if (tens == 7) roman += "LXX";
        else if (tens == 8) roman += "LXXX";
        else if (tens == 9) roman += "XC";

        if (ones == 1) roman += "I";
        else if (ones == 2) roman += "II";
        else if (ones == 3) roman += "III";
        else if (ones == 4) roman += "IV";
        else if (ones == 5) roman += "V";
        else if (ones == 6) roman += "VI";
        else if (ones == 7) roman += "VII";
        else if (ones == 8) roman += "VIII";
        else if (ones == 9) roman += "IX";

        System.out.println("Римская запись числа " + n + ": " + roman);
    }
}
