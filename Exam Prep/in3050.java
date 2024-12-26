public boolean in3050(int a, int b) {
  boolean first = ((a >= 30 && a <= 40) && (b >= 30 && b <= 40));
  boolean second = ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
  return (first || second);
}
