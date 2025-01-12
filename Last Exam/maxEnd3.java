public int[] maxEnd3(int[] nums) {
    int[] res = new int[nums.length];
    int max = Math.max(nums[0], nums[nums.length - 1]); // FIND MAX OF THE TWO

    for (int i = 0; i < nums.length; i++) {
        res[i] = max; // SET ELEMENTS TO THE MAX
    }
    return res;
}
