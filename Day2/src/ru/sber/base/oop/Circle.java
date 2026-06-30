package ru.sber.base.oop;

public class Circle {
    float radius;
    String color;

    public void area(float radius){
        System.out.println("S: " + Math.PI * radius * radius);
    }

    public void perimeter(float radius){
        System.out.println("l: " + 2 * Math.PI * radius);
    }

    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Circle{" + "radius= " + radius + ", color=" + color + '}';
    }
}