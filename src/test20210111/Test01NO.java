package test20210111;

import java.util.List;

public class Test01NO {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if(s.length() == 0) return s;
        char[] arr = s.toCharArray();
        for (List<Integer> pair : pairs) {
            int p0 = pair.get(0);
            int p1 = pair.get(1);

            char temp = arr[p0];
            arr[p0] = arr[p1];
            arr[p1] = temp;
        }

        return new String(arr);
    }
}
