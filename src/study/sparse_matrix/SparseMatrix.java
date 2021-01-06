package study.sparse_matrix;

import java.util.ArrayList;

/**
 * 稀疏数组
 */
public class SparseMatrix {
    //    public static int[][] parseToSm(int[][] arr) {
//        int row = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] != 0) {
//                    row++;
//                }
//            }
//        }
//        int[][] result = new int[row][3];
//        result[0][0] = arr.length;
//        result[0][1] = arr[0].length;
//        result[0][2] = row - 1;
//        int m = 1;
//        while (m < result.length) {
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[0].length; j++) {
//                    if (arr[i][j] != 0) {
//                        result[m][0] = i;
//                        result[m][1] = j;
//                        result[m][2] = arr[i][j];
//                        m++;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }

    /**
     * 转换为稀疏数组
     * @param arr   普通数组
     * @return      稀疏数组
     */
    public static int[][] parseToSm(int[][] arr) {
        int row = 1;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0) {
                    row++;
                    list.add(new int[]{i, j, arr[i][j]});
                }
            }
        }
        int[][] result = new int[row][3];
        result[0][0] = arr.length;
        result[0][1] = arr[0].length;
        result[0][2] = row - 1;
        for (int i = 0; i < list.size(); i++) {
            result[i+1] = list.get(i);
        }

        return result;
    }

    /**
     * 转换为普通数组
     * @param sm    稀疏数组
     * @return      普通数组
     */
    public static int[][] parseToFor(int[][] sm) {
        int count = 0;
        int[][] result = new int[sm[0][0]][sm[0][1]];
        for (int i = 1; i < sm.length; i++) {
            result[sm[i][0]][sm[i][1]] = sm[i][2];
        }

        return result;
    }
}
