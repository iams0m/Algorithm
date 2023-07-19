import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 방법 1
		int n = Integer.parseInt(st.nextToken());
		int[] score = new int[n];
		int sum = 0;
		int max = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			sum += score[i];
			if (max < score[i]) {
				max = score[i];
			}
		}
		System.out.println((double) sum * 100 / max / n);
		
		// 방법 2(배열 정렬 사용)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		// int n = Integer.parseInt(st.nextToken());
		// int[] score = new int[n];
		// int sum = 0;
		// int max = 0;

		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < score.length; i++) {
		// 	score[i] = Integer.parseInt(st.nextToken());
		// 	sum += score[i];
		// }
		// Arrays.sort(score);
		// max = score[n - 1];
		// System.out.println((double) sum * 100 / max / n);
	}
}
