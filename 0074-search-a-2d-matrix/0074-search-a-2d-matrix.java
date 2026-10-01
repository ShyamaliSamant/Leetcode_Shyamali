// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int left = 0;
//         int col= matrix[0].length;
//         int row = matrix.length;
//         int right = col -1;
//         int i =0;
//          while (i < row && target > matrix[i][col- 1]) {
//             i++;
//         }
//         if(i == row) return false;
//         if(target > matrix[i][right-1]) i++;
//         while(left <= right ){
//             int mid = left +(right -left)/2;
//             if(matrix[i][mid]== target) return true;
//             else if(matrix[i][mid] < target){
//                 left = mid + 1;
//             }else{
//                 right = mid -1;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int low=0;
        int high=((matrix.length)*m)-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            else if(matrix[mid/m][mid%m]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
