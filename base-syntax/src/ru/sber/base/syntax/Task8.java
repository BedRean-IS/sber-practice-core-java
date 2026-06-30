package ru.sber.base.syntax;
import java.util.Scanner;

public class Task8 {
    static void main() {
        Scanner in = new Scanner(System.in);
        char secret = 'M';

        while (true) {
            System.out.print("Введите букву A-Z: ");
            char user = in.next().toUpperCase().charAt(0);

            if (user == secret) {
                System.out.println("Right");
                break;
            } else if (user < secret) {
                System.out.println("You're too low");
            } else {
                System.out.println("You're too high");
            }
        }
    }
}
