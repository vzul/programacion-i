public int[] reverse3(int[] nums) {
  int[] res = new int[nums.length];
  for(int i = 0; i < nums.length; i++){
    res[i] = nums[nums.length - 1 - i];
  } return res;
}
