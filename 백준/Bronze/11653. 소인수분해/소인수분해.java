import java.io.*;
import java.util.*;

public class Main {
	// 소인수분해 : 어떤 수를 소수인 인수로 분해하는 것
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
	}
}