import java.io.*;

public class Main {
	// 소인수분해 : 어떤 수를 소수인 인수로 분해하는 것
	public static void main(String[] args) throws IOException {
		// 1. BufferedReader + StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}

		// 마지막으로 남은 N이 1이 아니면, N 자체가 소인수임을 의미
		if (N != 1) {
			sb.append(N);
		}
		
		System.out.println(sb);
	}
}
