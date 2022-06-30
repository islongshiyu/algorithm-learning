package d01;

public class Requirement2Solution2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fun(" + n + ") = " + fun(n));
    }

    public static long fun(long n) {
        long r = 1;

        for (long i = 1; i <= n; i++) {
            r *= i;
        }

        return r;
    }
}
