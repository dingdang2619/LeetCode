package JZOffer;

import java.util.ArrayList;

public class Offer10_I {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = (f0 + f1)%1000000007;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
