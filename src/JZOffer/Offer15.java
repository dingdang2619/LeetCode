package JZOffer;

public class Offer15 {
/*
     巧用 n & (n - 1)
     (n−1) 解析： 二进制数字 nn 最右边的 11 变成 00 ，此 11 右边的 00 都变成 11 。
     n & (n - 1) 解析： 二进制数字 nn 最右边的 11 变成 00 ，其余不变。

     请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。

    输入：00000000000000000000000000001011
    输出：3
    解释：输入的二进制串 00000000000000000000000000001011中，共有三位为 '1'。

*/

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

//    public int hammingWeight(int n) {
//        int sum = 0;
//        for (int i = 0; i < 32; i++) {
//            if (((1 << i) & n) == (1 << i)) sum++;
//        }
//        return sum;
//    }
}
