public class sudokuSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        // Example Sudoku puzzle (0 represents empty cells)
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveBoard(board)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("Unsolvable Sudoku.");
        }
    }

    // Function to solve the Sudoku using backtracking
    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                // If the cell is empty
                if (board[row][col] == 0) {
                    // Try placing digits 1-9
                    for (int number = 1; number <= GRID_SIZE; number++) {
                        if (isValidPlacement(board, number, row, col)) {
                            board[row][col] = number;

                            // Recursively attempt to solve the rest of the board
                            if (solveBoard(board)) {
                                return true;
                            }

                            // Undo the current cell for backtracking
                            board[row][col] = 0;
                        }
                    }
                    return false; // No valid number found, so backtrack
                }
            }
        }
        return true; // All cells are filled
    }

    // Function to check if placing a number is valid
    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        // Check the row
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int subgridRowStart = (row / 3) * 3;
        int subgridColStart = (col / 3) * 3;
        for (int i = subgridRowStart; i < subgridRowStart + 3; i++) {
            for (int j = subgridColStart; j < subgridColStart + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true; // Placement is valid
    }

    // Function to print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] == 0 ? "." : board[row][col]);
            }
            System.out.println();
        }
    }
}
