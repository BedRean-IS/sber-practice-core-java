package ru.sber.base.oop;

class PizzaOrder {
    enum Size{
        SMALL,
        MEDIUM,
        BIG
    }

    String name;
    Size size;
    boolean sauce;
    String address;
    boolean accepted;

    public PizzaOrder(String name, Size size, boolean sauce, String address){
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят.");
        } else {
            accepted = true;
            System.out.println("Заказ принят. " + this);
        }
    }

    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String sizeText = "";

        if (size == Size.SMALL) {
            sizeText = "Маленькая";
        } else if (size == Size.MEDIUM) {
            sizeText = "Средняя";
        } else if (size == Size.BIG) {
            sizeText = "Большая";
        }

        String sauceText;
        if (sauce) {
            sauceText = "с соусом";
        } else {
            sauceText = "без соуса";
        }

        return sizeText + " пицца \"" + name + "\" " + sauceText + " на адрес " + address + ".";
    }
}
