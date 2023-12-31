import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 방법 1 - Top-Down 방식

public class Main {

    static int[] seq;
    static Integer[] dp;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        seq = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // 0 ~ N - 1까지 탐색
        for (int i = 0; i < N; i++) {
            LIS(i);
        }

        int max = dp[0];

        // 최댓값 찾기
        for (int i = 1; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.print(max);
    }

    static int LIS(int N) {
        // 탐색 하지 않은 위치의 경우
        if (dp[N] == null) {
            // 1로 초기화
            dp[N] = 1;
            
            // N - 1부터 0까지 중, N보다 작은 값들을 찾으며 재귀 호출
            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}

// 방법 2 - Bottom-Up 방식
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
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // 최댓값 찾기
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        System.out.print(max);
    }
}
