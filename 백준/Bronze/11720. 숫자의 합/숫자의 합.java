import java.io.*;
// import java.util.Scanner;

public class Main {
	// 풀이 1 - BufferReader 사용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}

	// 풀이 2 - Scanner 사용
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	
	// 	int n = sc.nextInt();
	// 	String sNum = sc.next();
	
	// 	char[] cNum = sNum.toCharArray();
	
	// 	int sum = 0;
	// 	for (int i = 0; i < cNum.length; i++) {
	// 		sum += cNum[i] - '0';
	// 	}
	// 	System.out.println(sum);
	// 	}
	}
