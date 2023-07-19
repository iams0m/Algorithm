import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		// 방법 1(HashSet 이용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(h.size());

		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 방법 2(boolean 이용)
		// for (int i = 0; i < 10; i++) {
		// 	arr[Integer.parseInt(br.readLine()) % 42] = true;
		// }

		// int count = 0;
		// for (boolean value : arr) {
		// 	if (value == true) { // value 가 true 라면
		// 		count++;
		// 	}
		// }
		// System.out.println(count);
	}
}
