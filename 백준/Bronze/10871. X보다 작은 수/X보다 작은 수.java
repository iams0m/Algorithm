import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		// 결과를 저장할 StringBuilder 생성
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());

			if (value < x) {
				sb.append(value).append(' ');
			}
		}
		System.out.println(sb);
	}
}