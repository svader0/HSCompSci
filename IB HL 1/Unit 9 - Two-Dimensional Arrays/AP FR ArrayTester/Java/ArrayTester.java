public class ArrayTester {
    // Part (a)
    /**
     * Returns an array containing the elements of column c of arr2D in the same
     * order as they appear in arr2D. Precondition: c is a valid column index in
     * arr2D Postcondition: arr2D is unchanged
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] temp = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            temp[i] = arr2D[i][c];
        }
        return temp;
    }

    /**
     * Return true if and only if every value in arr1 appears in arr2. Precondition:
     * arr1 and arr2 have the same length Postcondition: arr1 and arer2 are
     * unchanged
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        boolean[] temp = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j])
                    temp[i] = true;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == false)
                return false;
        }
        return true;
    }

    /**
     * Returns true if arr contains any duplicate values; false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int value = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (value == arr[j])
                    return true;
            }
        }
        return false;
    }

    // Part(b)
    /**
     * Returns true if square is a Latin square as described in part (b); false
     * otherwise. Precondition: square has an equal number of rows and columns.
     * square has at least one row.
     */
    public static boolean isLatin(int[][] square) {

        if (containsDuplicates(square[0])) {
            return false;
        }
        for (int r = 1; r < square.length; r++) {
            if (!hasAllValues(square[0], square[r])) {
                return false;
            }
        }
        for (int c = 0; c < square[0].length; c++) {
            if (!hasAllValues(square[0], getColumn(square, c))) {
                return false;
            }
        }
        return true;
    }
}
