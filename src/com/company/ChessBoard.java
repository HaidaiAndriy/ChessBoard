package com.company;

public class ChessBoard {
    public static void chessBoard (int width, int height){
        char [][] ChessDesk = new char [height][width];
        for(int i = 0; i <width; i++){
            for(int h = 0; h < height; h++){
                if ((i + h)% 2 == 1) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" x ");
                }

            }
            System.out.print('\n');
        }
    }
}
