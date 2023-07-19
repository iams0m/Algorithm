import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
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
	}
}