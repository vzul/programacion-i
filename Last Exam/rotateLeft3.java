public int[] rotateLeft3(int[] nums) {
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length - 1; i++) {
        res[i] = nums[i + 1];
    }
    res[nums.length - 1] = nums[0];
    return res;
}
