package test20201206;

import java.util.*;

public class Test01 {
    /**
     * 面试题 01.06. 字符串压缩
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     */
    public static void main(String[] args) {
        String str = compressString("aaaaaabcddefccc");
        System.out.println(str);
    }


    public static String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        char[] chs = S.toCharArray();
        int count = 1;
        int i = 0, j = 0;
        while (i < S.length()) {
            if(j == S.length()){
                sb.append(chs[i]).append(j - i);
                break;
            }
            if (chs[i] == chs[j]) {
                j++;
            } else {
                sb.append(chs[i]).append(j - i);
                i = j;
            }
        }
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
