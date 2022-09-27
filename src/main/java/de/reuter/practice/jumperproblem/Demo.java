package de.reuter.practice.jumperproblem;

import java.io.Console;
import java.io.IOException;

public class Demo {

    private static int[][] field = new int[5][5];


    public static void main(String[] args) {
        jump(0, 0, 1);
        printField();
    }

    private static void printField() {
        for (int[] line : field) {
            System.out.print("[");
            for (int value : line) {
                System.out.print(value + ", ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    private static boolean jump(int currentX, int currentY, int moves) {
        if (completed()) {
            return true;
        }
        if (currentX < 0 || currentY < 0 || field.length <= currentY || field[0].length <= currentX || field[currentY][currentX] != 0) {
            return false;
        }
        if (field[currentY][currentX] == 0) {
            field[currentY][currentX] = moves;
            printField();
        }
        if (jump(currentX + 2, currentY + 1, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX + 1, currentY + 2, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX + 2, currentY - 1, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX + 1, currentY - 2, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX - 2, currentY + 1, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX - 1, currentY + 2, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX - 2, currentY - 1, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else if (jump(currentX - 1, currentY - 2, moves + 1)) {
            field[currentY][currentX] = moves;
            return true;
        } else {
            field[currentY][currentX] = 0;
            return false;
        }

    }

    private static boolean completed() {
        for (int[] line : field) {
            for (int value : line) {
                if (value == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
