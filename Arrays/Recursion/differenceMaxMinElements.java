    static int difference(int[] m){
        return difAux(m, 0, m[0], m[0]);
    }
    
    static int difAux(int[] m, int i, int currentMax, int currentMin){
        // base case: when array is fully traversed
        if(i == m.length - 1){ // we put -1 bc array elements are numbered starting from 0
            return currentMax - currentMin;
        }
        
        if(m[i] > currentMax){
            currentMax = m[i];
        }
        
        if(m[i] < currentMin){
            currentMin = m[i];
        }
        
        
        return difAux(m, i + 1, currentMax, currentMin);
    }
