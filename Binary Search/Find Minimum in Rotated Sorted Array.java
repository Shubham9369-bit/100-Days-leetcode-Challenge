class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;

            //Check kar rha hu ki nums of mid nums of right ke equal hai 
            if(nums[mid]>nums[end]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[st];
    }
}
