public String backAround(String str) {
  int n = str.length();
  char last = str.charAt(n - 1);
  
  return last + str + last;
}
