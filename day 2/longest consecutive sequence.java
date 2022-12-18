class Solution {
    public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    int max_size = 1;
    Set<Integer> intSet = new HashSet<Integer>();
    for (int i : nums) {
        intSet.add(i);
    }
    for (int i : nums) {
        if (!intSet.contains(i+1)) {
            int tmp = 1;
            while (intSet.contains(i-tmp)) {
                tmp++;
            }
            max_size = Math.max(tmp, max_size);
        }
    }
    return max_size;
}
}
