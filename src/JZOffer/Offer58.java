package JZOffer;

public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        if(s.length() == n) return s;
        String before = s.substring(0, n);
        String after = s.substring(n);
        return after + before;
    }
}
