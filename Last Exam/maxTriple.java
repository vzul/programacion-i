public int maxTriple(int[] nums) {
  int first = nums[0];
  int middle = nums[nums.length / 2];
  int last = nums[nums.length - 1];
  
  if(first > middle && first > last){
    return first;
  } else if (middle > first && middle > last){
    return middle;
  } else if (last > first && last > middle){
    return last;
  } else {
    return 0;
  }
}
