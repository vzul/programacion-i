public boolean double23(int[] nums) {
  int threecount = 0;
  int twocount = 0;
  for(int i = 0; i < nums.length; i++){
      if(nums[i] == 2){
      twocount++;
    } else if (nums[i] == 3){
      threecount++;
     }
  } return (twocount == 2 || threecount == 2);
}
