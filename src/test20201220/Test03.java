package test20201220;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "asdasd", s2 = "";
        System.out.println(isFlipedString(s1, s2));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if("".equals(s2)) return false;
        return (s1 + s1).contains(s2);
    }
}
