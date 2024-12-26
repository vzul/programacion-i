// Regular or: 1 + 1 = 1
// XOR: 1 + 1 = 0

public boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  return (aTeen && !bTeen || !aTeen && bTeen );
}
