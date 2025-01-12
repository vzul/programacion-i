public int bigDiff(int[] nums) {
  // Initialize max and min to the first element of the array
  int max = nums[0];
  int min = nums[0];
  
  // Start the loop from index 1 because nums[0] has already been assigned
  for(int i = 1; i < nums.length; i++) {
    if(nums[i] > max) {
      max = nums[i];  // Update max if a larger number is found
    } else if (nums[i] < min) {
      min = nums[i];  // Update min if a smaller number is found
    }
  }
  
  // Return the difference between max and min
  return max - min;
}
