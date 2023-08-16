import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 풀이 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));

			if (i % 10 == 9) {
				System.out.println();
			}
		}

		// 풀이 2
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String s = br.readLine();
		// int index = 0;
		
		// for (int i = 0; i < s.length(); i++) {
		// 	System.out.print(s.charAt(i));
		// 	index++;

		// 	if (index == 10) {
		// 		System.out.println();
		// 		index = 0;
		// 	}
		// }
	}
}
