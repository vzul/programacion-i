public class Main {
  
  static int fibonacci(int n){
    // base case 
    if(n == 0){
      return 0;
    } else if(n == 1){
      return 1;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  
  public static void main(String[] args){
     // See 20 first terms of fibonacci sequence
    for(int i = 0; i <= 20; i++){
      System.out.println(fibonacci(n));
    }
    System.out.println("8th term of Fibonacci sequence: " + fibonacci(8));
  }
}
