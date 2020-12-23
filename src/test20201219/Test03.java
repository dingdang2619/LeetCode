package test20201219;

import java.util.ArrayList;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(CheckPermutation("abc","bca"));
    }
    public static boolean CheckPermutation(String s1, String s2) {
        int[] list1 = new int[128];
        int[] list2 = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            list1[s1.charAt(i)] += 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            list2[s2.charAt(i)] += 1;
        }
        return Arrays.equals(list1, list2);
    }
}
