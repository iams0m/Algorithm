import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1(StringTokenizer 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] arr = new int[9][9];

		int max = 0;
		int x = 0;
		int y = 0;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((x + 1) + " " + (y + 1));
		
		// 방법 2(split 사용)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int[][] arr = new int[9][9];

		// int max = 0;
		// int x = 0;
		// int y = 0;

		// for (int i = 0; i < 9; i++) {
		// 	String[] str = br.readLine().split(" ");
		// 	for (int j = 0; j < 9; j++) {
		// 		arr[i][j] = Integer.parseInt(str[j]);
		// 		if (max < arr[i][j]) {
		// 			max = arr[i][j];
		// 			x = i;
		// 			y = j;
		// 		}
		// 	}
		// }

		// System.out.println(max);
		// System.out.println((x + 1) + " " + (y + 1));
	}
}
