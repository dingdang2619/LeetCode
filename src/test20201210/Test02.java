package test20201210;

import java.util.Set;
import java.util.TreeMap;

public class Test02 {
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
        StringBuilder sb = new StringBuilder();
        char[] chs = S.toCharArray();
        TreeMap<Character,Integer> map = new TreeMap<>();
        Set<Character> characters;
        for (char ch : chs) {
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                characters = map.keySet();
                for (Character character : characters) {
                    sb.append(character);
                    sb.append(map.get(character));
                }
                map.clear();
                map.put(ch, 1);
            }
        }
        characters = map.keySet();
        for (Character character : characters) {
            sb.append(character);
            sb.append(map.get(character));
        }
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
