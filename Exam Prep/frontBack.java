public String frontBack(String str) {
    // Handle edge cases for empty or single-character strings
    if (str.length() <= 1) {
        return str;
    }

    // Extract first and last characters
    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);

    // Extract the middle part
    String middle = str.substring(1, str.length() - 1);

    // Return the rearranged string
    return last + middle + first;
}
