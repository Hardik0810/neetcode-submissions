class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l1 = 0;
        int l2 = 0;
        int r1 = matrix.length - 1;
        int r2 = matrix[0].length - 1;
        int mid1,mid2 = 0;
        while((l1 <= r1) && (l2 <= r2)){
            mid1 = l1 + (r1 - l1)/2;
            mid2 = l2 + (r2 - l2)/2;
            if(matrix[mid1][mid2] == target){
                return true;
            }
            else if(matrix[mid1][mid2] < target){
                if(mid2 == matrix[0].length - 1){
                    if(mid1 == matrix.length - 1){
                        return false;
                    }
                    else{
                        l1 = mid1 + 1;
                        l2 = 0;
                    }
                }
                else{
                    l2 = mid2 + 1;
                    l1 = mid1;
                }
            }
            else{
                if(mid2 == 0){
                  r1 = mid1 - 1;
                  r2 =  matrix[0].length - 1;
                }
                else{
                    r2 = mid2 - 1;
                }

            }



        }
        return false;
        
    }
}
