public int[] front11(int[] a, int[] b) {
  int[] res = new int[2];
  int[] res2 = new int[1];
 
  if (a.length >= 1 && b.length >= 1){
    res[0] = a[0];
    res[1] = b[0];
    return res;
  } else if (a.length < 1 && b.length > 1){
    res2[0]= b[0];
    return res2;
  } else if (a.length > 1 && b.length < 1){
    res2[0] = a[0];
    return res2;
  } else {
    return a;
  }
  
  
}
