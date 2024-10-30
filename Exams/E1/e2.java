class Exam{
  static String f (int n1, int n2){
    if (n1 == 0 || n2 == 0)
        return "";
    else if (n1 > n2)
        return 'a' + f(n1-1,n2);
    else
        return 'b' + f(n1,n2-1);
  }
  public static void main(String[] args){
    System.out.println(f(2,4));
  }
}


// prints bbbab
