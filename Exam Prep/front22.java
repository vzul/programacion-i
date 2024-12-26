public String front22(String str) {
  int n = str.length();
  
  if(n > 2){
    char first = str.charAt(0);
    char second = str.charAt(1);
    String result = "" + first + second;
    return result + str + result;
  } else {
    return str + str + str;
  }
  
}
