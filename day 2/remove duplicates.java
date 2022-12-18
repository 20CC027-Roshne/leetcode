class Solution {
   public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int lastSum = 0,curSum;
        for (int i : nums) {
            curSum = Math.max(i,lastSum+i);
            max = Math.max(max,curSum);
            lastSum = curSum;
        }
        return max;
    }
}
