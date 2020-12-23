package test20201220;

import java.util.TreeSet;

public class Test01NO {
    public String removeDuplicateLetters(String s) {
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();
    }
}
