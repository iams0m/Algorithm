import java.io.*;

public class Main {

	final static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N + 1][10];

		// 첫번째 자릿수는 1로 초기화
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		// 두번째 자릿수부터 N까지 탐색
		for (int i = 2; i <= N; i++) {
			// i번째 자릿수의 자릿값들을 탐색 (0~9)
			for (int j = 0; j < 10; j++) {
				// 자릿값이 0일 경우, 이전 자리는 1만 가능
				if (j == 0) {
					dp[i][0] = dp[i - 1][1] % MOD;
				}
				// 자릿값이 9일 경우, 이전 자리는 8만 가능
				else if (j == 9) {
					dp[i][9] = dp[i - 1][8] % MOD;
				}
				// 그 외의 경우, 이전 자릿수의 자릿값 - 1, + 1 값의 경우의 수를 합한 경우의 수가 됨
				else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
				}
			}
		}
		long result = 0;

		// 각 자릿값마다 경우의 수를 모두 더해준다.
		for (int i = 0; i < 10; i++) {
			result += dp[N][i];
		}
		System.out.println(result % MOD);
	}
}