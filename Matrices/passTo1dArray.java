static int dimensionMatrix(char[][] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                count++; // count for each element encountered
            }
        } return count;
    }

    static char[] passToArray(char[][] a){
        int length = dimensionMatrix(a);
        char[] update = new char[length]; // Declaring destination array
        
        int index = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                update[index] = a[i][j];
                index++;
            }
        } return update;
        
    }

public static void main(String[] args) {
	    char[][] a = {{'a', '*', '~'},{'*','*','*'},{'~','~','~'}};
	    mostrarMatriz(a);
		
		char[] update = passToArray(a); // Assuming matrix is your 2D array
        System.out.print("1D Array: ");
        for (char c : update) {
        System.out.print(c + " "); // Print each character
        }
        System.out.println(); // Add a newline at the end
	
	}
