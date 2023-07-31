import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력값으로 들어오는 숫자의 개수를 무시하고, 개수를 저장할 count 변수를 0으로 초기화
		br.readLine();
		int count = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// StringTokenizer에 토큰이 남아있는 동안 반복
		while (st.hasMoreTokens()) {

			// 소수인 경우 true, 아닌 경우 false를 저장할 변수 isPrime을 true로 초기화
			boolean isPrime = true;

			int num = Integer.parseInt(st.nextToken());

			// num이 1인 경우 소수가 아니므로 다음 숫자로 넘어감
			if (num == 1) {
				continue;
			}

			// 2부터 num의 제곱근까지의 숫자들 중, 하나로 num을 나누어보며 소수인지 확인
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					// num이 i로 나누어지면 소수가 아니므로 isPrime을 false로 설정하고 반복문을 빠져나옴
					isPrime = false;
					break;
				}
			}

			// isPrime 값에 따라 소수인 경우 count를 1 증가
			if (isPrime) {
				count++;
			}
		}

		// 소수인 숫자의 개수 출력
		System.out.println(count);
	}
}
