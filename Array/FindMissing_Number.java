class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2; //yahi main formula maine use kiya hai kyuki jab hum pura sum nikal ke length of array ka
      //actual sum nikalnege to hume pta chalega ki kaun sa number missing hai
        int actualSum=0;

        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
}
