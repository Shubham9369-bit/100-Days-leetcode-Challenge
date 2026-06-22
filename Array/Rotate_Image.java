class Solution {
    public void rotate(int[][] matrix) {
        //Sabse pehle matrix ka transpose nikalte hai sirf temp variable ka use karke\
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Ab hum reverse kar denge sare rows ko
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
  }
}
