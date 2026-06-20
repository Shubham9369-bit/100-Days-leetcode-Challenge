class Solution {
    public void setZeroes(int[][] matrix) {

        // Check karenge ki first row ya first column me
        // pehle se koi zero present hai ya nahi
        boolean firstRow = false;
        boolean firstCol = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1:
        // First row aur first column ko marker ki tarah use karenge
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    // Agar zero first row me mila
                    if (i == 0) {
                        firstRow = true;
                    }

                    // Agar zero first column me mila
                    if (j == 0) {
                        firstCol = true;
                    }

                    // Current row aur column ko mark kar do
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2:
        // Markers ke basis par inner matrix ko zero karo
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3:
        // Agar first row me originally zero tha
        // to poori first row zero kar do
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4:
        // Agar first column me originally zero tha
        // to poora first column zero kar do
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
