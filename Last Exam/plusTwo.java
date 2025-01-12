public int[] plusTwo(int[] a, int[] b) {
  int[] res = new int[4];
  for(int i = 0; i < a.length; i++){
    res[i] = a[i];
    res[a.length + i] = b[i];
  }
  
  return res;
}


// alternative

public int[] plusTwo(int[] a, int[] b) {
  int[] res = new int[a.length + b.length];  // Size of res should be a.length + b.length

  // Copy elements from array a into res
  for (int i = 0; i < a.length; i++) {
    res[i] = a[i];
  }

  // Copy elements from array b into res starting from index a.length
  for (int i = 0; i < b.length; i++) {
    res[a.length + i] = b[i];
  }

  return res;
}
