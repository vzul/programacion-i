public int sum13(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length && !(nums[i] == 13); i++){
    sum += nums[i];
  } return sum;
}
