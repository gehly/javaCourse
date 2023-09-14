import java.util.Scanner;
public class Battleship {
	public static void main(String[] args) {
		
		// Print the welcome message
		System.out.println("Welcome to Battleship!\n");
		
		// Initialize variables
		int row;
		int col;
		int player1Ships = 5;
		int player2Ships = 5;
		Scanner input = new Scanner(System.in);
		char locBoard1[][] = new char[5][5];
		char locBoard2[][] = new char[5][5];
		char histBoard1[][] = new char[5][5];
		char histBoard2[][] = new char[5][5];
		
		for (int ii = 0; ii < 5; ii++) {
			for (int jj = 0; jj < 5; jj++) {
				locBoard1[ii][jj] = '-';
				locBoard2[ii][jj] = '-';
				histBoard1[ii][jj] = '-';
				histBoard2[ii][jj] = '-';
			}
		}
		
		
		// Read data for each player
		for (int player_id = 1; player_id < 3; player_id++) {
			
			// Print message to screen
			System.out.printf("Welcome Player %d\n", player_id);
			System.out.println("You will now enter the coordinates of 5 ships each occupying one space in a 5x5 grid.\n");
			
			// Loop to collect 5 valid ship coordinates
			for (int ii = 1; ii < 6; ii++) {
				
				// Prompt user for input row and column
				System.out.printf("Enter row and column index for ship %d. Provide two integers in the range [0,4] separated by a space:\n", ii);
			
				// Read the data
				row = input.nextInt();
				col = input.nextInt();
				
				// Exception handling
				
				// Store the data
				if (player_id == 1) {
					locBoard1[row][col] = '@';
				}
				else if (player_id == 2) {
					locBoard2[row][col] = '@';
				}
				
				
			
				
			}
			
			// Print player board
			System.out.printf("Current board for Player %d:\n", player_id);
			
			if (player_id == 1) {
				printBattleShip(locBoard1);
			}
			else if (player_id == 2) {
				printBattleShip(locBoard2);
			}
			
			
			// Print some new lines before next player entries
			System.out.println("\n\n\n");
			
		}
		
		
		// Begin gameplay
		while (player1Ships > 0 && player2Ships > 0) {
			
			// Player 1 turn			
			System.out.println("Player 1 enter target coordinates: \n");
			row = input.nextInt();
			col = input.nextInt();
			
			if (locBoard2[row][col] == '@') {
				locBoard2[row][col] = 'X';
				histBoard1[row][col] = 'X';
				System.out.println("Player 1 hit Player 2's ship!\n");
				player2Ships--;
			}
			else {
				locBoard2[row][col] = 'O';
				histBoard1[row][col] = 'O';
				System.out.println("Player 1 missed!");
			}
			
			System.out.println("Player 1 target board: \n");
			printBattleShip(histBoard1);
			
			// Check if Player 1 has won
			if (player2Ships == 0) {
				System.out.println("Player 1 has sunk all of Player 2's ships!!\n\n");
				System.out.println("Player 1's board: \n");
				printBattleShip(locBoard1);
				
				System.out.println("\nPlayer 2's board: \n");
				printBattleShip(locBoard2);
				
				break;
				
			}
			
			// Player 2 turn			
			System.out.println("Player 2 enter target coordinates: \n");
			row = input.nextInt();
			col = input.nextInt();
			
			if (locBoard1[row][col] == '@') {
				locBoard1[row][col] = 'X';
				histBoard2[row][col] = 'X';
				System.out.println("Player 2 hit Player 1's ship!\n");
				player1Ships--;
			}
			else {
				locBoard1[row][col] = 'O';
				histBoard2[row][col] = 'O';
				System.out.println("Player 2 missed!");
			}
			
			System.out.println("Player 2 target board: \n");
			printBattleShip(histBoard2);
			
			// Check if Player 2 has won
			if (player1Ships == 0) {
				System.out.println("Player 2 has sunk all of Player 1's ships!!\n\n");
				System.out.println("Player 1's board: \n");
				printBattleShip(locBoard1);
				
				System.out.println("\nPlayer 2's board: \n");
				printBattleShip(locBoard2);
				
				break;
				
			}
			
		}
		

	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}
