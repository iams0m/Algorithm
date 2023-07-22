import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		// 방법 1
		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			String S = str[1];

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);

		// 방법 2
		// for (int i = 0; i < T; i++) {
		// 	String[] str = br.readLine().split(" ");
		// 	int R = Integer.parseInt(str[0]);
		// 	String S = str[1];

		// 	for (int j = 0; j < S.length(); j++) {
		// 		for (int k = 0; k < R; k++) {
		// 			System.out.print(S.charAt(j));
		// 		}
		// 	}
		// 	System.out.println();
	}
}
