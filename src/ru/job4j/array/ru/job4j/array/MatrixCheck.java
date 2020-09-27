package ru.job4j.array.ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
     boolean result = true;
     for (int cell = 0; cell < board.length; cell++){
             if (board[row][cell] != 'X') {
                 result = false;
                 break;
             }
         }
     return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int value = 0; value < board.length; value++) {
            if (board[value][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int number = 0; number < board.length; number++) {
            rsl[number] = board[number][number];
        }
        return rsl;
    }
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
