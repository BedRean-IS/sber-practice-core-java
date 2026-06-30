package ru.sber.base.oop;

public class Main {
    static void main(String[] args) {
        Phone p1 = new Phone("111-11-11", "Samsung", 180.5);
        Phone p2 = new Phone("222-22-22", "iPhone");
        Phone p3 = new Phone();

        p3.number = "333-33-33";
        p3.model = "Xiaomi";
        p3.weight = 190.0;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.receiveCall("Алексей");
        p2.receiveCall("Мария", "999-99-99");

        System.out.println("Номер p1: " + p1.getNumber());
        System.out.println("Номер p2: " + p2.getNumber());
        System.out.println("Номер p3: " + p3.getNumber());

        p1.sendMessage("123-45-67", "234-56-78", "345-67-89");

        System.out.println();

        Circle circle1 = new Circle(5.0f, "Red");
        Circle circle2 = new Circle(3.5f, "Blue");

        System.out.println(circle1);
        circle1.area(circle1.radius);
        circle1.perimeter(circle1.radius);

        System.out.println();

        System.out.println(circle2);
        circle2.area(circle2.radius);
        circle2.perimeter(circle2.radius);

        System.out.println();

        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);

        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);

        System.out.println("Матрица 1:");
        m1.print();

        System.out.println("Матрица 2:");
        m2.print();

        System.out.println("Сумма матриц:");
        Matrix sum = m1.add(m2);
        if (sum != null) {
            sum.print();
        }

        System.out.println("Матрица 1 * number:");
        Matrix multByNumber = m1.multiplyByNum(2);
        multByNumber.print();

        System.out.println("Произведение матриц:");
        Matrix mult = m1.multiply(m2);
        if (mult != null) {
            mult.print();
        }


        System.out.println();

        Author author = new Author("Александр Пушкин", "мужской", "pushkin@mail.ru");
        Book book = new Book("Капитанская дочка", author, 1836);

        System.out.println(author);
        System.out.println(book);

        System.out.println("Имя автора: "+author.getName());
        System.out.println("Название книги: "+book.getTitle());

        author.setEmail("newpushkin@mail.ru");
        book.setYear(1837);

        System.out.println();
        System.out.println("После изменений:");
        System.out.println(author);
        System.out.println(book);

        System.out.println();

        PizzaOrder order1 = new PizzaOrder("Аль-Капчоне", PizzaOrder.Size.BIG, true, "Ярославская 101");

        System.out.println(order1);

        order1.order();
        order1.order();

        order1.cancel();
        order1.cancel();

        System.out.println();

        PizzaOrder order2 = new PizzaOrder("Маргарита", PizzaOrder.Size.SMALL, false, "Ленина 15");
        order2.order();

        System.out.println("Название: " + order2.getName());
        System.out.println("Размер: " + order2.getSize());
        System.out.println("Соус: " + order2.isSauce());
        System.out.println("Адрес: " + order2.getAddress());

        order2.setName("Пепперони");
        order2.setSize(PizzaOrder.Size.MEDIUM);
        order2.setSauce(true);
        order2.setAddress("Советская 20");

        System.out.println("После изменения:");
        System.out.println(order2);
    }
}
