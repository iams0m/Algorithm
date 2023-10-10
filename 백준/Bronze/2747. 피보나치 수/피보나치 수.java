import java.io.*;
public class Main {
	static int D[];
	public static void main(String[] args) throws IOException {
		// 1. Top-Down 방식
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		D = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			D[i] = -1;
		}
		D[0] = 0;
		D[1] = 1;	
		
		fibo(n);
		System.out.println(D[n]);
	}
	
	static int fibo(int n) {
		if (D[n] != -1) {
			return D[n];
		}
		return D[n] = fibo(n - 2) + fibo(n - 1); 

		// 2. Bottom-Up 방식
			
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int n = Integer.parseInt(br.readLine());
		// D = new int[n + 1];
		// for (int i = 0; i <= n; i++) {
		// 	D[i] = -1;
		// }
		// D[0] = 0;
		// D[1] = 1;
		
		// for (int i = 2; i <= n; i++) {
		// 	D[i] = D[i - 1] + D[i - 2];
		// }
		// System.out.println(D[n]);			
	}
}
