import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1(StringBuilder 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] array = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			array[i] = i;
		}
		for (int j = 0; j < m; j++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int k = x; k <= (x + y) / 2; k++) {
				int temp = array[k];
				array[k] = array[x + y - k];
				array[x + y - k] = temp;
			}
		}

		for (int z = 1; z <= n; z++) {
			sb.append(array[z]).append(" ");
		}
		System.out.println(sb);

		// 방법 2
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		// int n = Integer.parseInt(st.nextToken());
		// int m = Integer.parseInt(st.nextToken());

		// int[] array = new int[n];

		// for (int i = 0; i < array.length; i++) {
		// 	array[i] = i + 1;
		// }
		// for (int j = 0; j < m; j++) {
		// 	st = new StringTokenizer(br.readLine(), " ");
		// 	int x = Integer.parseInt(st.nextToken()) - 1;
		// 	int y = Integer.parseInt(st.nextToken()) - 1;

		// 	for (int k = x; k <= y; k++, y--) {
		// 		int temp = array[k];
		// 		array[k] = array[y];
		// 		array[y] = temp;
		// 	}
		// }

		// for (int z = 0; z < array.length; z++) {
		// 	System.out.print(array[z] + " ");

		// 	br.close();
		// }
	}
}
