public int[] makeEnds(int[] nums) {
  int[] res = new int[2];
  res[0] = nums[0];
  res[1] = nums[nums.length - 1];
  return res;
}
