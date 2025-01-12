static boolean sonDoblesConsecutivos(int[] col) {
    boolean status = true;
    boolean continueLoop = true;  // Boolean variable to control the loop
    
    for (int i = 1; i < col.length && continueLoop; i++) {  // Continue looping only if continueLoop is true
        if (col[i] != 2 * col[i - 1]) { // IN ORDER TO ACCESS I-1 WE MUST START LOOP AT 1 SO, SO THE FIRST ELEMENT CAN BE CHECKED W/ SECOND
            status = false;  // Set status to false if mismatch is found
            continueLoop = false;  // Set continueLoop to false to stop the loop
        }
    }
    
    return status;
}
