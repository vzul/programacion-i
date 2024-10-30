//author: Viviana Zuloaga

class Main{

  // FIRST EXERCISE

  static void displayNumberUpTo(int n){
    for(int i = 1; i <= n; i++){
      System.out.println(i);
    }
  }

  // SENCOND EXERCISE

  static boolean isPrime(int n){
    // base case:
    if(n < 2){
      return false;
    }
    for(int i = 2; i <= Math.sqrt(n); i++){
      if(n % i == 0){
        return false;
      }
    } return true;
  }


  // THIRD EXERCISE

  static void displayPrimesUpTo(int n){
    for(int i = 2; i <= n; i++){
      if (isPrime(i)){
        System.out.println(i);
      }
    }
  }

  static public void main(String[] args){
    System.out.println("Display numbers up to 10: ");
    displayNumberUpTo(10);
    System.out.println("Is 14 a prime? " + isPrime(14));
    System.out.println("Display primes up to 15: ");
    displayPrimesUpTo(15);
  }
}
