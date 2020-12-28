package JZOffer;

import java.util.Arrays;

public class Offer17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
    }
    public static int[] printNumbers(int n) {
        int size = (int) (Math.pow(10,n) - 1);
        System.out.println(size);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
