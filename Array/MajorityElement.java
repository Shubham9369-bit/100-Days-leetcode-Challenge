class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;

        HashMap<Integer,Integer> countMap=new HashMap<>();

        for(int i=0;i<n;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        for(int key:countMap.keySet()){
            if(countMap.get(key)>n/3){
                result.add(key);
            }
        }
        // for(int i=0;i<n;i++){
        //     if(result.contains(nums[i])){
        //         continue;
        //     }
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==nums[i]){
        //             count++;
        //         }
        //     }
        //     if(count>n/3){
        //         result.add(nums[i]);
        //     }
        // }
        return result;
    }
}
