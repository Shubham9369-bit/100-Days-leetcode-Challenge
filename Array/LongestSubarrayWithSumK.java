class Solution {
    public int longestSubarray(int[] nums, int k) {
        int left = 0, sum = 0, maxlen = 0;
        int n = nums.length;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }
}
