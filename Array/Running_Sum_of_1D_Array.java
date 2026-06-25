//An easy level leetcode problem to build understanding in array....


class Solution {
    public int[] runningSum(int[] nums) {
        int [] ans=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
     return ans;   
    }
}
