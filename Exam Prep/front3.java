public String front3(String str) {
    String front = "";
    
    // Determine the front part (first 3 characters or entire string if shorter)
    int length = Math.min(3, str.length());
    
    // Use a loop to add the first 3 characters (or less if the string is shorter)
    for (int i = 0; i < length; i++) {
        front += str.charAt(i);
    }
    
    // Return 3 copies of the front
    return front + front + front;
}
