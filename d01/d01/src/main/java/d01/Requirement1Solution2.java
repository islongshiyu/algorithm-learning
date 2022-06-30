package d01;

public class Requirement1Solution2 {
    public static void main(String[] args) {
        int sum = 0, n = 100;

        // 高斯算法：首项 + 末项）* 项数 / 2
        sum = (n + 1) * n / 2;

        System.out.println("sum = " + sum);
    }
}