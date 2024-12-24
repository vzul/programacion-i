public String countryAtWar(int[] arr1, int[] arr2) {
        String a = "A";
        String b = "B";
        String d = "DRAW";
        String flag = "";
        
        int aWins = 0;
        int bWins = 0;
        
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > arr2[i]){
                aWins++;
            } else if (arr1[i] < arr2[i]){
                bWins++;
            } 
        } 
        
        if(aWins > bWins){
            flag = a;
        } else if (aWins < bWins){
            flag = b;
        } else {
            flag = d;
        }
        
        return flag;
    }
