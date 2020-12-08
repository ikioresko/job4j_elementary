package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Clean code", 464);
        Book b2 = new Book("Head First", 717);
        Book b3 = new Book("Грокаем алгоритмы", 288);
        Book b4 = new Book("совершенный код", 896);
        Book[] lib = new Book[4];
        lib[0] = b1;
        lib[1] = b2;
        lib[2] = b3;
        lib[3] = b4;
        for (int i = 0; i < lib.length; i++) {
           Book book = lib[i];
            System.out.println("Название книги : " + book.getName());
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3");
        Book temp = b1;
        lib[0] = lib[3];
        lib[3] = temp;
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println("Название книги : " + book.getName());
        }
        System.out.println("Цикл с выводом книг с именем \"Clean code\"");
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Название книги : " + book.getName());
            }
        }
    }
}