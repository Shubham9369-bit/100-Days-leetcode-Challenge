class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // Final answer store karne ke liye list
        List<Integer> res = new ArrayList<>();

        // Edge case: agar matrix empty ho
        if (matrix == null || matrix.length == 0) {
            return res;
        }

        // Boundary variables
        // Inke through hum current active rectangle track karte hain
        int rowBegin = 0;                 // Top row
        int rowEnd = matrix.length - 1;  // Bottom row

        int colBegin = 0;                    // Left column
        int colEnd = matrix[0].length - 1;   // Right column

        // Jab tak valid rectangle exist karta hai
        while (rowBegin <= rowEnd && colBegin <= colEnd) {

      
            // Step 1 : Traverse Right
            // Top row ko left -> right print karo
           
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }

            // Top row process ho gayi,
            // ab next row ko new top maanenge
            rowBegin++;

          
            // Step 2 : Traverse Down
            // Right column ko top -> bottom print karo

            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }

            // Right column process ho gayi
            colEnd--;
            // Step 3 : Traverse Left
            // Bottom row ko right -> left print karo
            // Ye check duplicate printing se bachata hai
            // =========================
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]);
                }
            }

            // Bottom row process ho gayi
            rowEnd--;
            // Step 4 : Traverse Up
            // Left column ko bottom -> top print karo
            // Ye check duplicate printing se bachata hai
            // =========================
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);
                }
            }

            // Left column process ho gayi
            colBegin++;
        }

        return res;
    }
}
