public int[] midThree(int[] nums) {
  int[] res = new int[3];
  
  res[0]=nums[nums.length / 2 - 1];
  res[1]=nums[nums.length / 2];
  res[2]=nums[nums.length / 2 + 1];
  
  return res;
}
