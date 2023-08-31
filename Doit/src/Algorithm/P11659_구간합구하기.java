package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(st.nextToken()); // 숫자 개수
		int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수
		long[] S = new long[suNo + 1]; // 합 배열 선언
		st = new StringTokenizer(br.readLine());

		// 합 배열 생성
		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		// 구간 합 생성
		for (int q = 0; q < quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			// 질의 범위 받기
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i - 1]); // 합 배열을 이용하여 구간 합 출력하기
		}

	}

}
