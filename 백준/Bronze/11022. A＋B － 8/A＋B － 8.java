import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}
		br.close();
	}
}
