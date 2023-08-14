import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 풀이 1 - StringBuffer 사용하여 , 분리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			int A = str.charAt(0) - '0';
			int B = str.charAt(2) - '0';
			
			sb.append(A + B).append("\n");
		}
		System.out.println(sb);

		// 풀이2 - StringTokenizer 사용하여 , 분리
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st;

		// int T = Integer.parseInt(br.readLine());

		// for (int i = 0; i < T; i++) {
		// 	st = new StringTokenizer(br.readLine(), ",");
		// 	int A = Integer.parseInt(st.nextToken());
		// 	int B = Integer.parseInt(st.nextToken());
		// 	System.out.println(A + B);
		// }
	}
}
