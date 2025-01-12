public int[] swapEnds(int[] nums) {
  int temp1 = nums[0];
  int temp2 = nums[nums.length - 1];
  nums[0] = temp2;
  nums[nums.length - 1] = temp1;
  
  return nums;
}
