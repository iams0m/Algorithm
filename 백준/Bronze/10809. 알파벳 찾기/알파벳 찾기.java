import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1; // 배열을 -1로 초기화
		}
		
		String s = br.readLine();

		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);

			if (arr[ch - 97] == -1) { // 처음 등장하는 경우
				arr[ch - 97] = j; // 처음 등장하는 위치 출력
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
