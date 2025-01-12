public boolean no23(int[] nums) {
  boolean found = true; 
  for(int i = 0; i < nums.length && found; i++){ // KEEP LOOKING IF NOTHING HAS BEEN FOUND 
    if(nums[i] == 2 || nums[i] == 3){
      found = false;
    }
  } return found;
}
