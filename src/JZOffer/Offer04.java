package JZOffer;

/*
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

[[1,2,3,4,5],
[6,7,8,9,10],
[11,12,13,14,15],
[16,17,18,19,20],
[21,22,23,24,25]]
15
 */
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length-1, j = 0;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j] > target){
                i--;
            }else if(matrix[i][j] < target){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if (matrix.length == 1 || matrix[0].length == 1) {
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    if (target == matrix[i][j]) return true;
//                }
//            }
//            return false;
//        }
//        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;
//        int i = matrix.length - 1;
//        int j = 0;
//        while (true) {
//            if (i < 0 || j >= matrix[0].length) break;
//            if (target == matrix[i][j]) return true;
//            if (target < matrix[i][j]) {
//                i--;
//            } else {
//                j++;
//            }
//        }
//        return false;
//    }

}
