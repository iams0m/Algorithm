import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());

			if (A == 0 && B == 0 && C == 0) {
				break;
			}

			int max = Math.max(Math.max(A, B), C);

			// 삼각형 조건을 만족하지 못하는 경우
			if (max == A) {
				if (A >= B + C) {
					System.out.println("Invalid");
					continue;
				}
			}

			if (max == B) {
				if (B >= A + C) {
					System.out.println("Invalid");
					continue;
				}
			}

			if (max == C) {
				if (C >= A + B) {
					System.out.println("Invalid");
					continue;
				}
			}

			// 삼각형 조건을 만족하는 경우 - 1. 세 수가 모두 다른 경우
			if (A != B && B != C && A != C) {
				System.out.println("Scalene");
				continue;
			}

			// 삼각형 조건을 만족하는 경우 - 2. 세 수가 모두 같은 경우
			if (A == B && B == C && A == C) {
				System.out.println("Equilateral");
				continue;
			}

            // 삼각형 조건을 만족하는 경우 - 3. 두 수만 같은 경우
			if (A == B || B == C || A == C) {
				System.out.println("Isosceles");
				continue;
			}
		}
	}
}