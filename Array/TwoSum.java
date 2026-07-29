//I am doing this two sum problem in brute force appraoch and after i learn hashmap in future then definitly push that solutuon also.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> map=new HashMap<>();

        //Hum brute force se hi karte hai kooi dikkat nhi hai 

        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
