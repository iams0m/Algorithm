import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 가지수
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while (end_index != N) {
			// 투 포인터 이동 원칙
			if (sum == N) {
				count++;
				end_index++;
				sum = sum + end_index;
			} else if (sum > N) {
				sum = sum - start_index;
				start_index++;
			} else {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count); // 가지수 출력
	}

}