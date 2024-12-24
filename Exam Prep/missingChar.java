public String missingChar(String str, int n) {
  String copy = "";
  for(int i = 0; i < str.length(); i++){
    if(i != n){
     char ch = str.charAt(i); // Get each character
     copy += ch;
    }
  } return copy;
}
