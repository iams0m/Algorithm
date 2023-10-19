import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] seq = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp[i] = seq[i];
            int num = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (seq[i] > seq[j] && seq[j] > num) {
                    dp[i] = Math.max(seq[i] + dp[j], dp[i]);
                }
            }
        }

        // 최댓값 찾기
        int max = dp[0];
        for (int i = 1; i < N; i++) {
            max = Math.max(dp[i], max);
            }
        System.out.print(max);
    }
}