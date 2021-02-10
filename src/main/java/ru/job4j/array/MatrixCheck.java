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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int y = 0; y < board.length; y++) {
            if (board[y][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int x = 0; x < board.length; x++) {
            rsl[x] = board[x][x];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int z = 0; z < board.length; z++) {
            if (board[z][z] == 'X' && (monoVertical(board, z) || monoHorizontal(board, z))) {
                    result = true;
                    break;
            }
        } return result;
    }

}