static boolean[] union(boolean[] c1, boolean[] c2){
   boolean[] union = new boolean [10];
   for(int i = 0; i < 10; i++)
     union[i] = c1[i] || c2[i];
   return union;
  }
