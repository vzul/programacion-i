static boolean iguales(int[] arr){
        boolean flag = true;
        for(int i = 1; i < arr.length; i++){ // START FROM 2ND ELEMENT
            if(arr[i] != arr[i - 1]){ // IF CURRENT IS NOT EQUAL TO PREV
                flag = false;
            }
        } return flag;
    }
