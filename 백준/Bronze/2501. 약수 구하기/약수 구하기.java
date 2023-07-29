import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int count = 0; // 약수의 순서를 저장할 변수
		int result = 0; // K번째 약수를 저장할 변수

		// 약수 구하는 반복문
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++; // 약수이면, count 증가
			}
			// count가 K와 같아지면, 곧 그 약수가 K번째 약수란 뜻이기에 result에 저장 후 반복문 종료
			if (count == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
