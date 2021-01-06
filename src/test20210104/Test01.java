package test20210104;

public class Test01 {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = A[j][i];
            }
        }

        return result;
    }
}
