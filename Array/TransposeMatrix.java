class Solution {
    public int[][] transpose(int[][] matrix) {
        //Sabse pehle hume ek new matrix bnana padega kyuki agar agar koi aisa matrix milega jiska row aur column equal 
      //nhi hua....but agar m=n hua to dikkat nhi hoga aur hume new matrix bnani ki jaarurat nhi padegi....
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [][]ans=new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
        
    }
}
