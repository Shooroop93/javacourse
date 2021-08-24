package day17;

import day17.classesAndEnum.ChessPiece;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[][] chessPieces = new String[8][8];

        chessPieces[0][0] = ChessPiece.ROOK_BLACK.getColor();
        for (int i = 1; i < 5; i++ ){
            chessPieces[0][i] = ChessPiece.EMPTY.getColor();
        }
        chessPieces[0][5] = ChessPiece.ROOK_BLACK.getColor();
        chessPieces[0][6] = ChessPiece.KING_BLACK.getColor();
        chessPieces[0][7] = ChessPiece.EMPTY.getColor();

        chessPieces[1][0] = ChessPiece.EMPTY.getColor();
        chessPieces[1][1] = ChessPiece.ROOK_WHITE.getColor();
        chessPieces[1][2] = ChessPiece.EMPTY.getColor();
        chessPieces[1][3] = ChessPiece.EMPTY.getColor();
        chessPieces[1][4] = ChessPiece.PAWN_BLACK.getColor();
        chessPieces[1][5] = ChessPiece.PAWN_BLACK.getColor();
        chessPieces[1][6] = ChessPiece.EMPTY.getColor();
        chessPieces[1][7] = ChessPiece.PAWN_BLACK.getColor();

        chessPieces[2][0] = ChessPiece.PAWN_BLACK.getColor();
        chessPieces[2][1] = ChessPiece.EMPTY.getColor();
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK.getColor();
        chessPieces[2][3] = ChessPiece.EMPTY.getColor();
        chessPieces[2][4] = ChessPiece.EMPTY.getColor();
        chessPieces[2][5] = ChessPiece.EMPTY.getColor();
        chessPieces[2][6] = ChessPiece.PAWN_BLACK.getColor();
        chessPieces[2][7] = ChessPiece.EMPTY.getColor();

        chessPieces[3][0] = ChessPiece.QUEEN_BLACK.getColor();
        chessPieces[3][1] = ChessPiece.EMPTY.getColor();
        chessPieces[3][2] = ChessPiece.EMPTY.getColor();
        chessPieces[3][3] = ChessPiece.BISHOP_WHITE.getColor();
        chessPieces[3][4] = ChessPiece.EMPTY.getColor();
        chessPieces[3][5] = ChessPiece.EMPTY.getColor();
        chessPieces[3][6] = ChessPiece.EMPTY.getColor();
        chessPieces[3][7] = ChessPiece.EMPTY.getColor();

        chessPieces[4][0] = ChessPiece.EMPTY.getColor();
        chessPieces[4][1] = ChessPiece.EMPTY.getColor();
        chessPieces[4][2] = ChessPiece.EMPTY.getColor();
        chessPieces[4][3] = ChessPiece.BISHOP_BLACK.getColor();
        chessPieces[4][4] = ChessPiece.PAWN_WHITE.getColor();
        chessPieces[4][5] = ChessPiece.EMPTY.getColor();
        chessPieces[4][6] = ChessPiece.EMPTY.getColor();
        chessPieces[4][7] = ChessPiece.EMPTY.getColor();

        chessPieces[5][0] = ChessPiece.EMPTY.getColor();
        chessPieces[5][1] = ChessPiece.EMPTY.getColor();
        chessPieces[5][2] = ChessPiece.EMPTY.getColor();
        chessPieces[5][3] = ChessPiece.EMPTY.getColor();
        chessPieces[5][4] = ChessPiece.BISHOP_WHITE.getColor();
        chessPieces[5][5] = ChessPiece.PAWN_WHITE.getColor();
        chessPieces[5][6] = ChessPiece.EMPTY.getColor();
        chessPieces[5][7] = ChessPiece.EMPTY.getColor();

        chessPieces[6][0] = ChessPiece.PAWN_WHITE.getColor();
        chessPieces[6][1] = ChessPiece.EMPTY.getColor();
        chessPieces[6][2] = ChessPiece.EMPTY.getColor();
        chessPieces[6][3] = ChessPiece.QUEEN_WHITE.getColor();
        chessPieces[6][4] = ChessPiece.EMPTY.getColor();
        chessPieces[6][5] = ChessPiece.PAWN_WHITE.getColor();
        chessPieces[6][6] = ChessPiece.EMPTY.getColor();
        chessPieces[6][7] = ChessPiece.PAWN_WHITE.getColor();

        chessPieces[7][0] = ChessPiece.EMPTY.getColor();
        chessPieces[7][1] = ChessPiece.EMPTY.getColor();
        chessPieces[7][2] = ChessPiece.EMPTY.getColor();
        chessPieces[7][3] = ChessPiece.EMPTY.getColor();
        chessPieces[7][4] = ChessPiece.EMPTY.getColor();
        chessPieces[7][5] = ChessPiece.ROOK_WHITE.getColor();
        chessPieces[7][6] = ChessPiece.KING_WHITE.getColor();
        chessPieces[7][7] = ChessPiece.EMPTY.getColor();




        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }





    }
}
