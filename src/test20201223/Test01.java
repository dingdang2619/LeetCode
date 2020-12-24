package test20201223;

import java.util.*;

public class Test01 {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
//    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if(map.get(s.charAt(i)) == 1)   return i;
//        }
//        return -1;
//    }
}
