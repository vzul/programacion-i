    static int averageValue(int[] array){
    if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        } return sum / array.length;   
    }
