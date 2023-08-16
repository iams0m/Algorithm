import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 풀이 1 - StringBuilder를 사용하여 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);

		// 풀이 2 - System.out.println을 사용하여 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}
