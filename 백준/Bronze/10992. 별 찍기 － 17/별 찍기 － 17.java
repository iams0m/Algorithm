import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (-1) * i + n - 1; j++) {
				sb.append(" ");
			}
			sb.append("*");

			if (i == n - 1) {
				for (int j = 0; j < 2 * n - 2; j++) {
					sb.append("*");
				}
			} else if (i != 0) {
				if (i != n - 1) {
					for (int j = 0; j < 2 * i - 1; j++) {
						sb.append(" ");
					}
				}
				sb.append("*");
			}

			sb.append("\n");
		}
		System.out.println(sb);
	}
}