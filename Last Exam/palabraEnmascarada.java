static String palabraEnmascarada(char[] col, boolean[] aciertos){
        String result = "";
        for(int i = 0; i < col.length; i++){
            if(col[i] == ' '){
                result += ' ';
            } else if (aciertos(i)){
                result += col[i];
            } else {
                result += '*';
            }
        } return result;
    }
