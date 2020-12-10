package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();
        if (answer == 0) {
            System.out.print("Да");
        } else if (answer == 1) {
            System.out.print("Нет");
        } else {
        System.out.print("Может быть");
        }
    }
}