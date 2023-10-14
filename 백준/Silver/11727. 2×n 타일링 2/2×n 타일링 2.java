import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long D[] = new long[1001];
		D[1] = 1;
		D[2] = 3;
		for (int i = 3; i <= n; i++) {
			D[i] = (D[i - 1] + D[i - 2] * 2) % 10007;
		}
		System.out.println(D[n]);
	}
}