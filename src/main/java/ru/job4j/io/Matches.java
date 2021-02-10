package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matches = 11;
        int p = 1;
        String winner = "Игрок";
        System.out.println("Правила игры: На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек."
                + System.lineSeparator() + "Выигрывает тот, кто забрал последние спички."
                + System.lineSeparator() + "Возьмите несколько спичек, от 1 до 3");
        while (matches != 0) {
            System.out.println("Игрок " + p + " Ваш ход.");
            int pickup = Integer.valueOf(scan.nextLine());
            if (pickup > 3 || pickup < 1) {
                System.out.println("Можно взять только от 1 до 3 спичек");
                continue;
            }
            if (matches < pickup) {
                System.out.println("Возьмите меньше спичек, осталось " + matches + " шт");
                continue;
            }
            matches = matches - pickup;

            if (matches != 0) {
                if (p == 1) {
                    p++;
                } else {
                    p--;
                }
                System.out.println("Осталось " + matches + " шт");
            }
        }
        System.out.println("Игра окончена. Победил Игрок " + p);
    }
}