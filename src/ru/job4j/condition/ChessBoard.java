package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            result = Math.abs(x1 - x2);
        }

        return result;
    }
}
