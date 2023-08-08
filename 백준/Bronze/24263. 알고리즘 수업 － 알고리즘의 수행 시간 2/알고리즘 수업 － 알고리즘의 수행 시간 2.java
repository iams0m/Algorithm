import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        // for문이 한 번 돌면, for문에 적힌 변수만큼 시간 복잡도가 나옴
        // 시간 복잡도 : O(n)
        // 차수 : 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		System.out.println(1);
	}
}