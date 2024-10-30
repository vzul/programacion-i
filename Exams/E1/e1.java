class Exam{
  static boolean h (int n) {
    boolean res = true;
    int aux = n % 10;
    n = n / 10;
    while (res && n > 0){
        res = aux >= n % 10;
        n = n / 10;
    }
    return res;
  }
  public static void main(String[] args){
    System.out.println(h(523));
  }
}

// prints false
