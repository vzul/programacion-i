static boolean alMenosDos(int[] nums, int n) {
    int cont = 0;
    
    for (int i = 0; i < nums.length && cont < 2; i++) {
        if (nums[i] == n) {
            cont++;
        }
    }
    
    return cont == 2;
}
