import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 나눈 토큰들을 st에 저장
		System.out.print(st.countTokens()); // countTokens() : 토큰의 개수 반환
	}
}