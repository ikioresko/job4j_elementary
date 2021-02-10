package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Кличка котика: " + this.name + ". Сегодня он ел: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Гав");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Черный");
        black.show();
    }
}
