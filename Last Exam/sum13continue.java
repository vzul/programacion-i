public int sum13(int[] nums) {
    int sum = 0;
    
    for (int i = 0; i < nums.length; i++) {
        // If the current number is 13, skip the next number and don't add it to the sum
        if (nums[i] == 13) {
            i++;  // Skip the next number after 13
        } else {
            sum += nums[i];  // Add the current number to the sum
        }
    }
    
    return sum;
}
