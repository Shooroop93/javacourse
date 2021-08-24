package day17;

import day17.classesAndEnum.ChessPiece;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chess = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece chessPiece: chess) {

            System.out.print(chessPiece.getColor() + " ");

        }

    }
}