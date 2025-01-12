static int[] imagenEspejo(int[] col){
     int[] resultado = new int [col.length * 2];
     
    for(int i = 0; i < col.length; i++){
       resultado[i] = col[i];
       resultado[resultado.length-1-i] = col[i];
     }
   return resultado;
 }
