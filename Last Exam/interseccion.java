// LOGICAL AND

static boolean[] interseccion(boolean[] c1, boolean[] c2){
   return interseccionAux(c1,c2,0,new boolean [10]);
  }
  
static boolean[] interseccionAux(boolean[] c1, boolean[] c2, int i, boolean[] interseccion){
   if (i == c1.length)
     return interseccion;
   else{
     interseccion[i] = c1[i] && c2[i];
     return interseccionAux(c1,c2,i+1,interseccion);
   }
  }
