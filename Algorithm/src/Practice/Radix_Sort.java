package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Radix_Sort {

	static final int bucketSize = 10;

	public static void main(String[] args) {
		int[] arr = { 28, 93, 39, 81, 62, 72, 38, 26 };

		radix_Sort(arr.length, arr);

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void radix_Sort(int n, int[] arr) {
		// bucket 초기화
		Queue<Integer>[] bucket = new LinkedList[bucketSize];
		for (int i = 0; i < bucketSize; i++) {
			bucket[i] = new LinkedList<>();
		}

		int factor = 1;

		// 정렬할 자릿수의 크기 만큼 반복한다.
		for (int d = 0; d < 2; ++d) {
			for (int i = 0; i < n; ++i) {
				bucket[(arr[i] / factor) % 10].add(arr[i]);
			}

			for (int i = 0, j = 0; i < bucketSize; ++i) {
				while (!bucket[i].isEmpty()) {
					arr[j++] = bucket[i].poll();
				}
			}

			factor *= 10;
		}
	}
}