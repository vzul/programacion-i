public int[] frontPiece(int[] nums) {
  int[] res = new int[2];  // Initialize res with a fixed length of 2

  // If nums has fewer than 2 elements, return nums itself (but resize if necessary)
  if (nums.length < 2) {
    for (int i = 0; i < nums.length; i++) {
      res[i] = nums[i];  // Copy elements from nums into res if there's only 1 element
    }
    return res;
  }

  // Otherwise, copy the first two elements from nums into res
  for (int i = 0; i < 2; i++) {
    res[i] = nums[i];
  }

  return res;
}
