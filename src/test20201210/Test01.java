package test20201210;

import java.util.*;

public class Test01 {
    /**
     * 面试题 01.06. 字符串压缩
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     */
    public static void main(String[] args) {
        String str = compressString("aabcccccaaa");
        System.out.println(str);
    }


    public static String compressString(String S) {
        if (S==null || S.equals("")){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chs = S.toCharArray();
        char chr = chs[0];
        int sum = 1;
        for (int i = 1; i < chs.length; i++) {
            if (chr == chs[i]){
                sum += 1;
            }else{
                sb.append(chr);
                sb.append(sum);
                sum = 1;
                chr = chs[i];
            }
        }
        sb.append(chr);
        sb.append(sum);
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
