import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N의 범위가 int의 범위를 초과하므로 long형을 써서 N을 입력 받음
		long n = Integer.parseInt(br.readLine());
		
		System.out.println(n * 4);
	}
}
