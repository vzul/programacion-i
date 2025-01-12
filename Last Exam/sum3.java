public int sum3(int[] nums) {
  int sum = 0;
  if(nums.length != 3){
    return sum;
  }
  for(int i = 0; i < nums.length; i++){
    sum += nums[i];
  } return sum;
}
