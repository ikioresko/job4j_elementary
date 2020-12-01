package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int x = 0; x < board.length; x++) {
            if (board[row][x] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}