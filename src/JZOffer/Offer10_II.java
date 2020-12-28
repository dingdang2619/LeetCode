package JZOffer;

public class Offer10_II {
    public int numWays(int n) {
        int a = 1, b = 1, temp = 0;
        if (n == 0) return 1;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        return temp;
    }
}
