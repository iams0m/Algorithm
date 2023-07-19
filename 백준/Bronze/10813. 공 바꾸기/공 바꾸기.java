import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		for (int j = 0; j < M; j++) {
			int tmp;
			st = new StringTokenizer(br.readLine(), " ");
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			tmp = arr[X - 1];
			arr[X - 1] = arr[Y - 1];
			arr[Y - 1] = tmp;
		}
		br.close();

		for (int k : arr) {
			System.out.print(k + " ");
		}
		
		// 방법 2(BufferWriter 사용)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		// int N = Integer.parseInt(st.nextToken());
		// int M = Integer.parseInt(st.nextToken());
		// int[] arr = new int[N];
		// int temp;

		// for (int i = 0; i < N; i++) {
		// 	arr[i] = i + 1;
		// }
		// for (int j = 0; j < M; j++) {
		// 	st = new StringTokenizer(br.readLine());

		// 	int X = Integer.parseInt(st.nextToken());
		// 	int Y = Integer.parseInt(st.nextToken());

		// 	temp = arr[X - 1];
		// 	arr[X - 1] = arr[Y - 1];
		// 	arr[Y - 1] = temp;
		// }

		// for (int k = 0; k < arr.length; k++) {
		// 	bw.write(arr[k] + " ");
		// }
		// br.close();
		// bw.flush();
		// bw.close();
	}
}
