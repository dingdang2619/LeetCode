package test20201219;

import java.util.HashSet;

/*
    位运算：
        对每一个字符进行提取 按照ascii码表将1左移asc位 和aa做与运算
        一旦之前出现过 必定结果不为0 返回false
        若之前未出现 和aa做或操作 并将结果赋给aa 即保存已经出现的字符在其按照ascii码表排序的位置
 */
public class Test02 {
    //    public boolean isUnique(String astr) { //位运算
//        int aa = 0;
//        for (int i = 0; i < astr.length(); i++) {
//            char c = astr.charAt(i);
//            int asc = c - 'a';
//            int cc = 1 << asc;
//            if ((cc & aa) != 0) return false;
//            aa |= cc;
//        }
//        return true;
//    }
    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        for (char aChar : chars) {
            if(astr.length() != (astr.replace(String.valueOf(aChar),"").length()-1))return false;
        }
        return true;
    }
}
