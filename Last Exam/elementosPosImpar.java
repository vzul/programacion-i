static int[] elementosPosImpar (int[] col){
    int[] resultado = new int[col.length/2];
    for (int i = 1; i < col.length; i = i + 2)
      resultado[i/2] = col[i];
    return resultado;
  } // de elementosPosImpar
