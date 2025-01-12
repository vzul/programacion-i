static boolean esNIFCorrecto(char[] charr) {
    if (!tieneFormatoNIF(charr)) {
        return false;
    }

    int num = aNum(charr);
    char expectedLetter = letraNIF(num % 23);

    return expectedLetter == charr[8];
}


// OR

static boolean esNIFCorrecto (char[] arr){
   return tieneFormatoNIF(arr) && letraNIF(aNum(arr) % 23) == arr[8];
 }
