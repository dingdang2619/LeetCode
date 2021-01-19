package dfs;

/**
 * 机器人走方格
 * 给定两个正整数x y， 请返回机器人的走法数目。
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(dfs(2,3));
    }

    public static int dfs(int x, int y) {
        if (x == 1 ||y == 1) return 1;
        return dfs(x - 1, y) + dfs(x, y - 1);
    }
}
