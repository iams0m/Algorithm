import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int max = Math.max(Math.max(A, B), C);

		while (true) {
			// 삼각형 조건을 만족하지 못하는 경우
			if (max == A) {
				if (A >= B + C) {
					System.out.println(B + C + B + C - 1);
					break;
				}
			}

			if (max == B) {
				if (B >= A + C) {
					System.out.println(A + C + A + C - 1);
					break;
				}
			}

			if (max == C) {
				if (C >= A + B) {
					System.out.println(A + B + A + B - 1);
					break;
				}
			}
			// 삼각형 조건을 만족하는 경우
			System.out.println(A + B + C);
			break;
		}
	}
}