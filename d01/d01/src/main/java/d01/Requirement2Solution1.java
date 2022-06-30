package d01;

public class Requirement2Solution1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fun(" + n + ") = " + fun(n));
    }

    public static long fun(long n) {
        return n == 1 ? 1 : n * fun(n - 1);
    }
}
