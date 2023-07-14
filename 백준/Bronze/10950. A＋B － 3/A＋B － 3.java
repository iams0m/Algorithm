import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T

		StringTokenizer st; // 입력을 정수 A와 B로 쪼개기 위해서 StringTokenizer 이용
		StringBuilder sb = new StringBuilder(); // 마지막에 한 번에 출력하기 위한 StringBuilder

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
