package test20201220;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
    }

        public static String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        char[] newchars = new char[length*3];
        int flag = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                newchars[flag++] = chars[i];
            } else {
                newchars[flag++] = '%';
                newchars[flag++] = '2';
                newchars[flag++] = '0';
            }
        }
        return new String(newchars, 0, flag);
    }
}
