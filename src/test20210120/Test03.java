package test20210120;

/**
 * 605. 种花问题
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * <p>
 * 给你一个整数数组flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
 * 另有一个数n ，能否在不打破种植规则的情况下种入n朵花？能则返回 true ，不能则返回 false。
 */
public class Test03 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0){
            return n <= 1;
        }
        int cur = 0;
        int result = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (cur == 3) {
                result++;
                cur = 1;
            } else if (cur == 2 && i == 2) {
                result++;
                cur = 0;
            }
            if (result >= n) return true;
            if (flowerbed[i] == 0) {
                cur++;
            } else {
                cur = 0;
            }
        }
        if (cur >= 2) result++;
        return result >= n;
    }
}
