public int[] makeMiddle(int[] nums) {
  int[] res;

  // Check if the array length is odd or even
  if (nums.length % 2 == 0) {
    res = new int[2];
    res[0] = nums[nums.length / 2 - 1];
    res[1] = nums[nums.length / 2];
  } else {
    res = new int[1];
    res[0] = nums[nums.length / 2];
  }

  return res;
}
