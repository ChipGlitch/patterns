package com.company;

public class Main {

    public static void main(String[] args) {
        final int COLUMNS = 6;
        final int ROWS = 8;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}
