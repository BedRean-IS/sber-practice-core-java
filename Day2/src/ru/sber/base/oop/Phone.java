package ru.sber.base.oop;

public class Phone {
    String number;
    String model;
    double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + ", номер: " + phoneNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение будет отправлено на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Phone{" + "number= " + number + ", model= " + model + ", weight= " + weight + '}';
    }
}