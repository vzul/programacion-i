public String notString(String str) {
  String ex = "not";
  if(str.startsWith(ex)){
    return str;
  } else {
    return ex + " " + str;
  }
}
