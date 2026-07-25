import java.util.HashSet;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        // dono arrays ke elements set mein  daalenge
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }
        
        // set ko array mein convert karenge
        int[] result = new int[set.size()];
        int index = 0;
        for (int val : set) {
            result[index++] = val;
        }
        
        return result;
    }
}
