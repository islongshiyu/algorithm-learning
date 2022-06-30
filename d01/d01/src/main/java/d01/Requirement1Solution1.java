package d01;

public class Requirement1Solution1 {
    public static void main(String[] args) {
        int sum = 0, n = 100;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}
