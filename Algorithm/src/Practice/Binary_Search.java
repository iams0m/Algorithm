package Practice;

public class Binary_Search {

	// 반복문으로 구현
	public static boolean BSearch(int[] arr, int n) {
		// 시작점(left)을 배열의 첫 번째 인덱스로 초기화합니다.
		int left = 0;

		// 끝점(right)을 배열의 마지막 인덱스로 초기화합니다.
		int right = arr.length - 1;

		// 중간 인덱스를 저장할 변수(mid)를 선언합니다.
		int mid;

		// 시작점(left)이 끝점(right)보다 작거나 같은 동안 반복합니다.
		while (left <= right) {
			// 중간 인덱스(mid)를 계산합니다.
			mid = (left + right) / 2;

			// 중간 값(arr[mid])이 찾는 값(n)보다 작으면
			if (arr[mid] < n)
				// 시작점을 중간 인덱스 다음으로 이동하여 오른쪽 절반에서 탐색합니다.
				left = mid + 1;
			// 중간 값(arr[mid])이 찾는 값(n)보다 크면
			else if (arr[mid] > n)
				// 끝점을 중간 인덱스 이전으로 이동하여 왼쪽 절반에서 탐색합니다.
				right = mid - 1;
			// 중간 값(arr[mid])이 찾는 값(n)과 같으면
			else
				// 찾는 값이 배열에 존재하므로 true를 반환합니다.
				return true;
		}

		// 찾는 값이 배열에 존재하지 않으면 false를 반환합니다.
		return false;
	}

	// 재귀로 구현
	public static boolean BSearchRecursive(int[] arr, int n, int left, int right) {
		// 만약 시작점(left)이 끝점(right)보다 크다면, 배열에서 찾는 값이 존재하지 않으므로 false를 반환합니다.
		if (left > right)
			return false;

		// 중간 인덱스(mid)를 계산합니다.
		int mid = (left + right) / 2;

		// 중간 값(arr[mid])이 찾는 값(n)보다 작으면
		if (arr[mid] < n)
			// 중간 인덱스(mid)를 기준으로 오른쪽 절반에서 재귀적으로 탐색합니다.
			return BSearchRecursive(arr, n, mid + 1, right);
		// 중간 값(arr[mid])이 찾는 값(n)보다 크면
		else if (arr[mid] > n)
			// 중간 인덱스(mid)를 기준으로 왼쪽 절반에서 재귀적으로 탐색합니다.
			return BSearchRecursive(arr, n, left, mid - 1);
		// 중간 값(arr[mid])이 찾는 값(n)과 같으면
		else
			// 찾는 값이 배열에 존재하므로 true를 반환합니다.
			return true;
	}

}
