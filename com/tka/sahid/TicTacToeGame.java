package com.tka.sahid;
import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args) {
        char [][] tictactoeBoard = new char[3][3];
        for (int i = 0; i< tictactoeBoard.length; i++){
            for(int j = 0; j< tictactoeBoard[i].length; j++){
                tictactoeBoard[i][j]=' ';
            }
        }
        char player ='X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while(!gameOver){
            printTheBoard(tictactoeBoard);
            System.out.println("Player " + player + " enter :");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(tictactoeBoard[row][col]==' '){
                //place the element
                tictactoeBoard[row][col]= player;
                gameOver=haveWon(tictactoeBoard,player);
                if(gameOver){
                    System.out.println("Player " + player + " won :");
                }
                else{
                    if(player=='X'){
                        player = 'O';
                    }
                    else {
                        player='X';
                    }
                }
            }else {
                System.out.println("Invalid move");
            }
            if(!haveWon(tictactoeBoard,player) && isBoardfull(tictactoeBoard)){
                System.out.println("Game is Draw");
                break;
            }
        }

        printTheBoard(tictactoeBoard);
    }

    private static boolean isBoardfull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ' ') return false;

            }

        }
        return true;
    }

    private static boolean haveWon(char[][] board, char player) {
        //rows check
        for (int i=0;i< board.length;i++){
            if(board[i][0]==player &&board[i][1]==player&&board[i][2]==player){
                return true;
            }
        }

        // column check
        for (int j=0;j< board[0].length;j++){
            if(board[0][j]==player &&board[1][j]==player&&board[2][j]==player){
                return true;
            }
        }
        //diagonal check
        if(board[0][0]==player && board[1][1]==player &&board[2][2]==player) return true;
        if(board[0][2]==player && board[1][1]==player &&board[2][0]==player) return true;
        return false;

    }

    private static void printTheBoard(char[][] board) {
        for (int i=0;i< board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j] + " |");
            }
            System.out.println();
        }
    }
}