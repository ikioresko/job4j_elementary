package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matches = 11;
        int p1 = 0;
        int p2 = 1;
        String winner = "Игрок";
        System.out.println("Правила игры: На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек."
                + System.lineSeparator() + "Выигрывает тот, кто забрал последние спички."
                + System.lineSeparator() + "Возьмите несколько спичек, от 1 до 3");
        while (matches != 0) {

            if (p1 < p2) {
                System.out.println("Игрок 1, Ваш ход.");
                int pickup = Integer.valueOf(scan.nextLine());
                if (pickup > 3 || pickup < 1) {
                    System.out.println("Можно взять только от 1 до 3 спичек");
                    continue;
                }
                if (matches < pickup) {
                    System.out.println("Возьмите меньше спичек");
                    continue;
                }
                matches = matches - pickup;
                System.out.println("Осталось " + matches + " шт");
                p1++;
                winner = "Игрок 1";
                if (matches == 0) {
                    break;
                }
            }

            if (p1 == p2) {
                System.out.println("Игрок 2, Ваш ход.");
                int pickup = Integer.valueOf(scan.nextLine());
                if (pickup > 3 || pickup < 1) {
                    System.out.println("Можно взять только от 1 до 3 спичек");
                    continue;
                }
                if (matches < pickup) {
                    System.out.println("Возьмите меньше спичек");
                    continue;
                }
                matches = matches - pickup;
                System.out.println("Осталось " + matches + " шт");
                p2++;
                winner = "Игрок 2";
            }
        }
        System.out.println("Игра окончена. Победил " + winner);
    }
}