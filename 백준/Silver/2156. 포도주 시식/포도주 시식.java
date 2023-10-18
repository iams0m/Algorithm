import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        arr = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0; // dp 배열을 Integer로 선언해주었기 때문에 0으로 초기화하는 과정 필요
        dp[1] = arr[1];

        if (n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(recur(n));

    }

    static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(Math.max(recur(n - 2), recur(n - 3) + arr[n - 1]) + arr[n], recur(n - 1));
        }
        return dp[n];
    }
}