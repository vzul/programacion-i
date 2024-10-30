static int maxNConsecutivos (int num, int n){
    int contador = 0;
	int maxConsecutivos = 0;
	while (num > 0) {
	    if (num%10 == n){
		contador++;
	    }
	    else{
		    if (contador > maxConsecutivos)
		        maxConsecutivos = contador;
		    contador = 0;
	   }
	   num = num / 10;
	}
	if (contador > maxConsecutivos)
	    maxConsecutivos = contador;
	return maxConsecutivos;
}

