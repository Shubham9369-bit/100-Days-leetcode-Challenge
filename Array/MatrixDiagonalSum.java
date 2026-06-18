class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        // Ek hi loop me main diagonal aur secondary diagonal dono ka sum add kar rahe hain
        for (int i = 0; i < n; i++) {

            // Main diagonal -> row aur column index same hote hain
            sum += mat[i][i];

            // Secondary diagonal -> row + column = n - 1
            sum += mat[i][n - 1 - i];
        }

        // Odd size matrix me center element dono diagonals me common hota hai,
        // isliye ek baar extra add hua hoga, use subtract kar do
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
