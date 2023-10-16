import java.io.*;

// 방법 1 - Bottom-Up 방식
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

// 방법2 - Top-Down 방식
public class Mainn {

	static Long[][] dp;
	static int N;
	final static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new Long[N + 1][10];

		// 첫번째 자릿수는 1로 초기화
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}

		long result = 0;

		// 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
		for (int i = 1; i <= 9; i++) {
			result += recur(N, i);
		}
		System.out.println(result % MOD);

	}

	// digit : 자릿수, val : 자릿값
	// 첫째 자릿수는 각 val이 끝이기 때문에 경우의 수는 1밖에 없다.
	// 즉, dp[1]의 각 자릿값은 1로 초기화 되어 있어야 한다.
	static long recur(int digit, int val) {
		// 첫째 자릿수에 도착한다면, 더이상 탐색할 필요 없음
		if (digit == 1) {
			return dp[digit][val];
		}

		// 해당 자릿수의 val값에 대해 탐색하지 않았을 경우(memoization, 재귀호출 중복 방지)
		if (dp[digit][val] == null) {
			// val이 0일 경우, 이전 자리는 1만 가능
			if (val == 0) {
				dp[digit][val] = recur(digit - 1, 1);
			}
			// val이 9일 경우, 이전 자리는 8만 가능
			else if (val == 9) {
				dp[digit][val] = recur(digit - 1, 8);
			}
			// 그 외의 경우, val - 1과 val + 1 값의 경우의 수를 합한 경우의 수가 됨
			else {
				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
			}
		}
		return dp[digit][val] % MOD;
	}
}
