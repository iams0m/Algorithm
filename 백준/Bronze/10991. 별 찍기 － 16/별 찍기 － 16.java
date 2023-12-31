import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= n; i++) {
			sb.append(" ".repeat(n - i)).append("* ".repeat(i)).append("\n");
		}
		System.out.println(sb);
	}
} 