import java.io.*;
public class Main {
	// 방법 1 - DP 사용
	static Integer[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
		System.out.print(recur(N));
	}

	static int recur(int N) {
		if (dp[N] == null) {
			// 6으로 나눠지는 경우
			if (N % 6 == 0) {
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3으로만 나눠지는 경우
			else if (N % 3 == 0) {
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2로만 나눠지는 경우
			else if (N % 2 == 0) {
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
	
	// 방법 2 - 재귀 호출 할 때 같이 연산 횟수 갱신하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.print(recur(N, 0));
	}
	static int recur(int N, int count) {
		// N이 2 미만인 경우, 누적된 count 값 반환
		if (N < 2) {
			return count;
		}
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
	}
}
