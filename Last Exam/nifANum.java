static int aNum (char[] nif){
 // se declara una variable donde se va a almacenar el resultado
   int num = 0;
 // se recorre el array de digitos
    for (int i = 0; i < 8; i++){
 // se va almacenando el resultado
       num = num * 10 + aDigito(nif[i]);
   }
 return num;
 }
