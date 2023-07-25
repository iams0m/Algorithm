import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] size = br.readLine().split(" ");
		int N = Integer.parseInt(size[0]);
		int M = Integer.parseInt(size[1]);
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];

		// 배열 A 입력 받기
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(input[j]);
			}
		}

		// 배열 B 입력 받기
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(input[j]);
			}
		}

		StringBuilder sb = new StringBuilder();
		// 결과 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(A[i][j] + B[i][j]).append(" ");
			}
			sb.append(System.lineSeparator());
		}

		System.out.print(sb);
	}
}
