public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false));
  // shortened to:
  return (aSmile == bSmile);
}
