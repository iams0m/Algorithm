import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String f = "factor\n"; // 첫 번째 수가 두 번째 수의 약수인 경우 출력할 문자열
		String m = "multiple\n"; // 첫 번째 수가 두 번째 수의 배수인 경우 출력할 문자열
		String n = "neither\n"; // 위 두 경우에 해당하지 않는 경우 출력할 문자열

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 무한 반복을 통해 정수를 입력받고, 약수 또는 배수 여부를 판단하여 결과 출력
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			// 두 입력값이 모두 0이면 입력 종료
			if (a == 0 && b == 0) {
				break;
			}
			// b가 a의 약수인 경우
			if (b % a == 0) {
				sb.append(f); // "factor"를 결과 문자열에 추가
			}
			// a가 b의 약수인 경우
			else if (a % b == 0) {
				sb.append(m); // "multiple"을 결과 문자열에 추가
			}
			// 약수 또는 배수 관계가 아닌 경우
			else {
				sb.append(n); // "neither"를 결과 문자열에 추가
			}
		}
		System.out.println(sb); // 결과 문자열 출력
	}
}
