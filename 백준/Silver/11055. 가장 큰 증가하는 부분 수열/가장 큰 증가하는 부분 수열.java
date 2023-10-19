import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        seq = new int[N + 1];
        dp = new Integer[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = seq[1];
        recur(N);
        int max = 0;

        // 최댓값 찾기
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.print(max);

    }

    static int recur(int N) {
        if (dp[N] == null) {
            dp[N] = seq[N];
            // N - 1부터 1까지 중, N보다 작은 값들을 찾으며 재귀 호출
            for (int i = N - 1; i >= 1; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(recur(i) + seq[N], dp[N]);
                } else {
                    recur(i);
                }
            }
        }
        return dp[N];
    }
}
