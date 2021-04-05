public class LightBoard {
	/**
	 * The lights on the board, where true represents on and false represents off.
	 */
	private boolean[][] lights;

	/*
	 * Constructors a LightBoard object with specified values. Used for testing.
	 */
	public LightBoard() {
		lights = new boolean[][] { { true, true, false, true, true }, { true, false, false, true, false },
				{ true, false, false, true, true }, { true, false, false, false, true },
				{ true, false, false, false, true }, { true, true, false, true, true },
				{ false, false, false, false, false } };
	}

	// -------------------------------- Part A -------------------------------//
	/**
	 * Constructs a LightBoard object having numRows rows and numCols columns.
	 * Precondition: numRows > 0, numCols > 0 Postcondition: each light has a 40%
	 * probability of being set to on.
	 */
	public LightBoard(int numRows, int numCols) {
		lights = new boolean[numRows][numCols];
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				int rand;
				rand = (int) Math.floor(Math.random() * 10 + 1); // random num of 1-10
				lights[r][c] = rand <= 4 ? true : false;
			}
		}
	}

	// -------------------------------- Part B -------------------------------//
	/**
	 * Evaluates a light in row index row and column index col and returns a status
	 * as described in part (b). Precondition: row and col are valid indexes in
	 * lights.
	 * 
	 * If the light is on, return false if the number of lights in its column that
	 * are on is even, including the current light.
	 * 
	 * If the light is off, return true if the number of lights in its column that
	 * are on is divisible by three.
	 * 
	 * Otherwise, return the light’s current status.
	 * 
	 */
	public boolean evaluateLight(int row, int col) {
		int onInCol = 0;
		for (int i = 0; i < lights.length; i++) {
			if (lights[i][col]) {
				onInCol++;
			}
		}
		if (lights[row][col] == true) {
			if (onInCol % 2 == 0) {
				return false;
			}
		} else {
			if (onInCol % 3 == 0) {
				return true;
			} else {
				return lights[row][col];
			}
		}
		return lights[row][col];
	}

	// --------------------------------------------------------------------------
	public void printBoard() {
		for (boolean[] rows : lights) {
			for (boolean col : rows) {
				System.out.printf("%-7b", col);
			}
			System.out.println("\n");
		}
	}
}