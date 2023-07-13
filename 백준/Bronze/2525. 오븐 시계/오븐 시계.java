import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());

		int total = A * 60 + B + C; // 총 시간을 분으로 변경

		if (total >= 1440) { // 24시간 넘어가면, 0시 0분으로 리셋
			total -= 1440;
			A = total / 60;
			B = total % 60;
			System.out.println(A + " " + B);
		} else {
			A = total / 60;
			B = total % 60;
			System.out.println(A + " " + B);
		}
	}
}
