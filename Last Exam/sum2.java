public int sum2(int[] nums) {
    if (nums.length == 0) {
        return 0; // Return 0 if the array is empty
    } else if (nums.length == 1) {
        return nums[0]; // Return the first element if there's only one
    } else {
        return nums[0] + nums[1]; // Return the sum of the first two elements
    }
}
