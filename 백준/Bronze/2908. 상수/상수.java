import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.println(A > B ? A : B);

		// 방법 2
		// int[] A = new int[3];
		// int[] B = new int[3];

		// for (int i = 0; i < 3; i++) {
		// 	A[i] = System.in.read() - '0';
		// }
		// System.in.read();
		// for (int i = 0; i < 3; i++) {
		// 	B[i] = System.in.read() - '0';
		// }

		// int tA = A[0] + A[1] * 10 + A[2] * 100;
		// int tB = B[0] + B[1] * 10 + B[2] * 100;
		// System.out.println(Math.max(tA, tB));
	}
}
