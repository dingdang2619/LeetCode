package study.sparse_matrix;

public class SMTest {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0, 0, 0, 22, 0, 0, 15},
                {0, 11, 0, 0, 0, 17, 0},
                {0, 0, 0, -6, 0, 0, 0},
                {0, 0, 0, 0, 0, 39, 0},
                {91, 0, 0, 0, 0, 0, 0},
                {0, 0, 28, 0, 0, 0, 0}
        };
        int[][] ints = SparseMatrix.parseToSm(arr);

        int[][] formal = SparseMatrix.parseToFor(ints);
        printArr(ints);

    }

    public static void printArr(int[][] arr) {
        for (int[] a : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(a[j]+"  ");
            }
            System.out.println();
        }
    }
}
