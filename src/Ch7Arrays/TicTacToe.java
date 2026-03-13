/**
 * This class implements the playable tic-tac-toe game. The project supports different board sizes, two player mode, and a mode to play against a computer.
 *
 * @author Dermot Lu
 */

package Ch7Arrays;

import java.util.Scanner;

public class TicTacToe {
    /**
     * This tracks the dimension of the square game table.
     */
    private static int BOARD_SIZE;
    /**
     * This tracks whether the game has ended.
     */
    private static boolean game_ended;
    /**
     * This represents the current player's symbol ('X' or 'O').
     */
    private static char current_player;
    /**
     * The total number of moves played in the game.
     */
    private static int move_number;
    /**
     * This flag is true if the user is playing against the computer. Otherwise, it is false.
     */
    private static boolean one_player_mode;
    /**
     * This is the 2D representation of the tic-tac-toe board.
     */
    private static char[][] board;

    /**
     * This initializes the game state, including the board size, player turn, and grid characters.
     *
     * @param in The Scanner used to read from user input.
     */
    private static void initalizeBoard(Scanner in) {
        BOARD_SIZE = getBoardSize(in);
        board = new char[BOARD_SIZE][BOARD_SIZE];

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                board[i][j] = '-';
            }
        }
        game_ended = false;
        current_player = 'X';
        move_number = 0;
    }

    /**
     * This prompts the user for the square board's size.
     *
     * @param in The Scanner used to get user input.
     * @return The integer size of the board.
     */
    private static int getBoardSize(Scanner in) {
        System.out.print("Please enter the desired board size: ");
        return in.nextInt();
    }

    /**
     * This asks if the user would like to play against the computer.
     *
     * @param in The Scanner used to get user input.
     * @return The boolean flag representing if AI mode is enabled.
     */
    private static boolean isAIModeDesired(Scanner in) {
        System.out.print("Would you like to play against the computer? The computer will be Player O (y/n): ");
        return in.next().equalsIgnoreCase("y");
    }

    /**
     * This prints the current board state with tab characters for formatting.
     */
    private static void printBoard() {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * This validates if a move is within the board's bounds and if the desired move is empty.
     *
     * @param row    The row index to check.
     * @param column The column index to check.
     * @return The boolean flag representing if the move is valid.
     */
    private static boolean isValidMove(int row, int column) {
        if (row >= board.length || row < 0 || column >= board[0].length || column < 0) {
            return false;
        }

        return board[row][column] == '-';
    }

    /**
     * This handles the logic for a human player's move.
     *
     * @param current_player The character of the player who is making the move.
     * @param in             The Scanner used to get user input.
     * @return An array containing the row and column of the move made.
     */
    private static int[] makeMove(char current_player, Scanner in) {
        System.out.print("Player " + current_player + ", please enter your move in one-based {row} {column} format: ");

        int row = in.nextInt() - 1;
        int column = in.nextInt() - 1;

        while (!isValidMove(row, column)) {
            System.out.println("Sorry, but that is not a valid move. Please try again.");
            row = in.nextInt() - 1;
            column = in.nextInt() - 1;
        }
        board[row][column] = current_player;

        return new int[]{row, column};
    }

    /**
     * This makes the move of the computer using a greedy approach. It uses priority for its strategy:
     * 1. Check if the computer can win.
     * 2. Check if the computer must block the opponent.
     * 3. Take the center of the board.
     * 4. Take the corners of the board.
     * 5. Take any empty move.
     *
     * @param ai_player The AI's character (always 'O' in this version).
     * @param player    The player's character (always 'X' in this version).
     * @return An array containing the computer's move.
     */
    private static int[] makeGreedyAIMove(char ai_player, char player) {
        //move to win
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '-') {
                    board[i][j] = ai_player;
                    if (hasWon(i, j, ai_player)) return new int[]{i, j};
                    board[i][j] = '-';
                }
            }
        }
        //block opponent's win
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '-') {
                    board[i][j] = player;
                    if (hasWon(i, j, player)) {
                        board[i][j] = ai_player;
                        return new int[]{i, j};
                    }
                    board[i][j] = '-';
                }
            }
        }
        //take the center
        int center = board.length / 2;
        if (board[center][center] == '-') {
            board[center][center] = ai_player;
            return new int[]{center, center};
        }
        //take the corners
        int[][] corners = {{0, 0}, {0, board.length - 1}, {board.length - 1, 0}, {board.length - 1, board.length - 1}};
        for (var it : corners) {
            if (board[it[0]][it[1]] == '-') {
                board[it[0]][it[1]] = ai_player;
                return it;
            }
        }
        //do whatever
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '-') {
                    board[i][j] = ai_player;
                    return new int[]{i, j};
                }
            }
        }

        //never reach this area
        return new int[]{-1, -1};
    }

    /**
     * This checks if the current move resulted in a win.
     *
     * @param current_row    The row index to check.
     * @param current_column The column index to check.
     * @param current_player The player who made the move.
     * @return The boolean flag representing whether the player has won.
     */
    private static boolean hasWon(int current_row, int current_column, char current_player) {
        boolean row_win = true, column_win = true;
        boolean diagonal_win = current_row == current_column;
        boolean reverse_diagonal_win = current_row + current_column == board.length - 1;

        for (int i = 0; i < board.length; ++i) {
            if (row_win) {
                if (board[current_row][i] != current_player) row_win = false;
            }
            if (column_win) {
                if (board[i][current_column] != current_player) column_win = false;
            }
            if (diagonal_win) {
                if (board[i][i] != current_player) diagonal_win = false;
            }
            if (reverse_diagonal_win) {
                if (board[i][board.length - 1 - i] != current_player) reverse_diagonal_win = false;
            }
        }

        return row_win || column_win || diagonal_win || reverse_diagonal_win;
    }

    /**
     * This checks to see if the game is over, either by a player win or a tie.
     *
     * @param last_move The coordinates of the last, most recent move.
     */
    private static void checkGameOver(int[] last_move) {
        if (hasWon(last_move[0], last_move[1], current_player)) {
            System.out.println("Player " + current_player + " has won! Here is the final board:");
            printBoard();
            game_ended = true;

        } else if (move_number == BOARD_SIZE * BOARD_SIZE) {
            System.out.println("It's a tie! Here is the final board: ");
            printBoard();
            game_ended = true;

        }
    }

    /**
     * This checks which player should move and executes that turn.
     *
     * @param in The Scanner to get user input.
     * @return An array containing the turn taken.
     */
    private static int[] playTurn(Scanner in) {
        if (one_player_mode && current_player == 'O') {
            int[] last_move = makeGreedyAIMove('O', 'X');
            System.out.println("The computer played " + (last_move[0] + 1) + " and " + (last_move[1] + 1) + ".");
            return last_move;
        } else {
            return makeMove(current_player, in);
        }
    }

    /**
     * The main method, which sets up the game, plays it, and handles the main control flow.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!\n");
        one_player_mode = isAIModeDesired(in);

        initalizeBoard(in);
        while (!game_ended) {
            printBoard();
            int[] last_move = playTurn(in);
            ++move_number;
            checkGameOver(last_move);

            if (!game_ended) {
                current_player = (current_player == 'X') ? 'O' : 'X';
            }
        }

        in.close();
    }
}
