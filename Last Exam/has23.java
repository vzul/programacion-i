public boolean has23(int[] nums) {
  boolean found = false;
  for(int i = 0; i < nums.length && !found; i++){
    if(nums[i] == 2 || nums[i] == 3){
      found = true;
    }
  } return found;
}
