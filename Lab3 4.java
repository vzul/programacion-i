class Lab3{

    static boolean esPar(int num){
        return num % 2 == 0;
    }
    
    static int ultimoDigito(int num){
          return num % 10;
       }
  
    static boolean hacen10 (int n1, int n2) {
     return ((n1 + n2 == 10) || n1 == 10 || n2 == 10); 
    }
   
    static boolean esLetra (char c) {
      int a = 'A';
      int b = 'z';
      int d = c;
      return (d >= a && d <= b);
    
    }

    static double calcularPropina (double precio, double porcentaje) {
      return  (precio + porcentaje);
    } 
    
    static boolean seguirDurmiendo(boolean entreSemana, boolean vacaciones) {
      return (!entreSemana || vacaciones );
      } 

 
 static double convertirACelsius (double fahrenheit) {
     return (fahrenheit - 32.0) * 5.0/9.0;
 
 }

    static public void main(String[] args){

        System.out.println("Es par 5? " + esPar(5));
        System.out.println("Es par 8? " + esPar(8));
        System.out.println("Es par -8? " + esPar(-8));
        System.out.println("Es par -7? " + esPar(-7));

       // Ejemplo ultimoDigito
      
        System.out.println("Ultimo digito de 234 es " + ultimoDigito(234));
        System.out.println("Ultimo digito de 3 es " + ultimoDigito(3));
    
        // Ejemplo hacen10
        
        System.out.println("Hacen 10 (10,9)? " +  hacen10(10,9));
        System.out.println("Hacen 10 (1,8)? " +  hacen10(1,8));
        System.out.println("Hacen 10 (6,4)? " +  hacen10(6,4));
        
        // Ejemplo esLetra
        
        System.out.println("Es letra 'a'? " + esLetra('a'));
        System.out.println("Es letra 'Z'? " + esLetra('Z'));
        System.out.println("Es letra '?' ? " + esLetra('?'));
        
        // Ejemplo calcularPropina
        
        System.out.println("Total: " + calcularPropina(100.0, 10.0));
        System.out.println("Total: " + calcularPropina(18.0, 6.0));
        System.out.println("Total: " + calcularPropina(45.0, 5.0)); 
        
        // Ejemplo seguirDurmiendo
        
        System.out.println("Es finde o vacaciones? " + seguirDurmiendo(false, false));
        System.out.println("Es finde o vacaciones? " + seguirDurmiendo(true, false));
        System.out.println("Es finde o vacaciones? " + seguirDurmiendo(false, false));
        
    // Ejemplo convertirACelsius
      
      System.out.println("32 F en celsius: " + convertirACelsius (32.0));
      System.out.println("50 F en celsius: " + convertirACelsius (50.0));
      System.out.println("86 F celsius: " + convertirACelsius (86.0));

    }

}