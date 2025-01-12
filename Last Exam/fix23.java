public int[] fix23(int[] nums) {
  for(int i = 1; i < nums.length; i++){ // START AT INDEX 1 SO WE CAN COMPARE W FIRST ELEMENT @ INDEX 0
    if(nums[i-1] == 2 && nums[i] == 3){ // COMPARE ELEMENTS
      nums[i] = 0;
    }
  } return nums;
}
