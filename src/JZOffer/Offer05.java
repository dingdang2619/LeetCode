package JZOffer;

public class Offer05 {
    public static void main(String[] args) {

    }

    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                sb.delete(i,i);
                sb.insert(i,"%20");
            }
        }
        return sb.toString();
    }
//    public static String replaceSpace(String s) {
//        return s.replaceAll(" ", "%20");
//    }
//    public static String replaceSpace(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c == ' '){
//                sb.append("%20");
//            }else{
//                sb.append(c);
//            }
//
//        }
//        return sb.toString();
//    }
}
