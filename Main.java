public static int numNonZeroRows(int[][] array2D){
    int count = 0;
    for(int i = 0;i < array2D.length;i++){
        boolean isNonZeroRow = true;
        for(int j = 0;j < array2D[i].length;j++){
            if(array2D[i][j]== 0){
                isNonZeroRow = false;
                break;
            }
        }
        if(isNonZeroRow){
            count++;
        }
    }
    return count;
}