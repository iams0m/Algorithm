import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 방법1 - Bottom-Up 방식

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 초기화 하기
        dp[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(dp[i], max);
        }
        System.out.print(max);
    }
}

// 방법2 - Top-Down 방식
public class Main {
    
    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 초기화 하기
        dp[0] = arr[0];
        max = arr[0];

        // dp의 마지막 index는 n - 1이므로 n - 1부터 Top-Down 탐색
        recur(n - 1);

        System.out.print(max);
    }

    static int recur(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
            max = Math.max(dp[n], max);
        }
        return dp[n];
    }
}
