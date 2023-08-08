import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        // 이중 for문의 경우, n * n 만큼 시간 소요
        // 시간 복잡도 : O(n^2)
        // 차수 : 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println((long) (Math.pow(n, 2)));
		System.out.println(2);
	}
}