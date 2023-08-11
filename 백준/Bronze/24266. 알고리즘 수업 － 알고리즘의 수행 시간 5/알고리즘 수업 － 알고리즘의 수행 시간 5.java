import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(n * n * n);
		// System.out.println((long) Math.pow(n, 3));
		// Math.pow : double형으로 계산하고 리턴
		// 너무 큰 long 숫자는 double 형으로 표현시, 오차범위가 존재하여 정확한 계산 어려움
		System.out.println(3);
	}
}
