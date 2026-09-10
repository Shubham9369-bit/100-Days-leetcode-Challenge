class Solution {
    public int search(int[] nums, int tar) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;

            if(nums[mid]==tar) return mid;
            if(nums[st]<=nums[mid]){
                if(nums[st]<=tar && tar<=nums[mid]){
                    //left me dhundho
                    end=mid-1;
                }
                else{
                    //right mee dhundhne ke liye 
                    st=mid+1;
                }
            }else{
                if(nums[mid]<=tar&& tar<=nums[end]){
                    // right me dhundhne ke liye 
                    st=mid+1;
                }
                else{
                    //left me dhundhne ke liye
                    end=mid-1;
                }
            }    
        }return -1;
    }
}
