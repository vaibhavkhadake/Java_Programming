package com.bridgelabzs.functional;


import java.util.Scanner;

public class Ss {

	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	static void initBoard() {
		System.out.println("TIC TAC TOE GAME \n Computer is X \n Player  is O ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	static void putVal() {
		int i;
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of X and Y by space");
			i = sc.nextInt();
			j = sc.nextInt();
		}
		if (BOARD[i][j] == -10) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Computer Choosing " + i + " " + j);
			}
		} else
			putVal();

	}

	static boolean win() {
		return    ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)  //1st row
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)  //2nd row 
 				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)  //3rd row
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)  //1st column
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)	//2nd column
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)  //3rd column
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)  //1st diagonal
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));//2nd column
	}

	static void play() {
		initBoard();
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			System.out.println("Computers turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Computer won");
				return;
			}
			player = 0;
		}
	}

	public static void main(String[] args) {

		play();
	}
}
